package com.nklkarthi.neo4j;


import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.NotFoundException;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

public class Neo4jLiveTest {

    private static GraphDatabaseService graphDb;

    @Before
    public void setUp() {
        GraphDatabaseFactory graphDbFactory = new GraphDatabaseFactory();
        graphDb = graphDbFactory.newEmbeddedDatabase(new File("data/cars"));
    }

    @After
    public void tearDown() {
        graphDb.shutdown();
    }

    @Test
    public void testPersonCar() {
        graphDb.beginTx();
        Node car = graphDb.createNode(Label.label("Car"));
        car.setProperty("make", "tesla");
        car.setProperty("model", "model3");

        Node owner = graphDb.createNode(Label.label("Person"));
        owner.setProperty("firstName", "nklkarthi");
        owner.setProperty("lastName", "nklkarthi");

        owner.createRelationshipTo(car, RelationshipType.withName("owner"));

        Result result = graphDb.execute("MATCH (c:Car) <-[owner]- (p:Person) " +
                "WHERE c.make = 'tesla'" +
                "RETURN p.firstName, p.lastName");

        Map<String, Object> firstResult = result.next();
        Assert.assertEquals("nklkarthi", firstResult.get("p.firstName"));
    }

    @Test
    public void testCreateNode() {

        graphDb.beginTx();

        Result result = graphDb.execute("CREATE (nklkarthi:Company {name:\"nklkarthi\"})" +
                "RETURN nklkarthi");

        Map<String, Object> firstResult = result.next();
        Node firstNode = (Node) firstResult.get("nklkarthi");
        Assert.assertEquals(firstNode.getProperty("name"), "nklkarthi");
    }

    @Test
    public void testCreateNodeAndLink() {
        graphDb.beginTx();

        Result result = graphDb.execute("CREATE (nklkarthi:Company {name:\"nklkarthi\"}) " +
                "-[:owns]-> (tesla:Car {make: 'tesla', model: 'modelX'})" +
                "RETURN nklkarthi, tesla");

        Map<String, Object> firstResult = result.next();
        Assert.assertTrue(firstResult.containsKey("nklkarthi"));
        Assert.assertTrue(firstResult.containsKey("tesla"));
    }

    @Test
    public void testFindAndReturn() {
        graphDb.beginTx();

        graphDb.execute("CREATE (nklkarthi:Company {name:\"nklkarthi\"}) " +
                "-[:owns]-> (tesla:Car {make: 'tesla', model: 'modelX'})" +
                "RETURN nklkarthi, tesla");

        Result result = graphDb.execute("MATCH (company:Company)-[:owns]-> (car:Car)" +
                "WHERE car.make='tesla' and car.model='modelX'" +
                "RETURN company.name");

        Map<String, Object> firstResult = result.next();
        Assert.assertEquals(firstResult.get("company.name"), "nklkarthi");
    }

    @Test
    public void testUpdate() {
        graphDb.beginTx();

        graphDb.execute("CREATE (nklkarthi:Company {name:\"nklkarthi\"}) " +
                "-[:owns]-> (tesla:Car {make: 'tesla', model: 'modelX'})" +
                "RETURN nklkarthi, tesla");

        Result result = graphDb.execute("MATCH (car:Car)" +
                "WHERE car.make='tesla'" +
                " SET car.milage=120" +
                " SET car :Car:Electro" +
                " SET car.model=NULL" +
                " RETURN car");

        Map<String, Object> firstResult = result.next();
        Node car = (Node) firstResult.get("car");

        Assert.assertEquals(car.getProperty("milage"), 120L);
        Assert.assertEquals(car.getLabels(), Arrays.asList(Label.label("Car"), Label.label("Electro")));

        try {
            car.getProperty("model");
            Assert.fail();
        } catch (NotFoundException e) {
            // expected
        }
    }

    @Test
    public void testDelete() {
        graphDb.beginTx();

        graphDb.execute("CREATE (nklkarthi:Company {name:\"nklkarthi\"}) " +
                "-[:owns]-> (tesla:Car {make: 'tesla', model: 'modelX'})" +
                "RETURN nklkarthi, tesla");

        graphDb.execute("MATCH (company:Company)" +
                " WHERE company.name='nklkarthi'" +
                " DELETE company");

        Result result = graphDb.execute("MATCH (company:Company)" +
                " WHERE company.name='nklkarthi'" +
                " RETURN company");

        Assert.assertFalse(result.hasNext());
    }

    @Test
    public void testBindings() {
        graphDb.beginTx();

        Map<String, Object> params = new HashMap<>();
        params.put("name", "nklkarthi");
        params.put("make", "tesla");
        params.put("model", "modelS");

        Result result = graphDb.execute("CREATE (nklkarthi:Company {name:$name}) " +
                "-[:owns]-> (tesla:Car {make: $make, model: $model})" +
                "RETURN nklkarthi, tesla", params);

        Map<String, Object> firstResult = result.next();
        Assert.assertTrue(firstResult.containsKey("nklkarthi"));
        Assert.assertTrue(firstResult.containsKey("tesla"));

        Node car = (Node) firstResult.get("tesla");
        Assert.assertEquals(car.getProperty("model"), "modelS");
    }
}
