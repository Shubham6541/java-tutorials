package com.nklkarthi.couchbase.mapreduce;

public interface CouchbaseKeyGenerator<T> {

    String generateKey(T t);
}
