package org.nklkarthi.persistence.deletion.config;

import org.nklkarthi.config.PersistenceJPAConfigL2Cache;

import java.util.Properties;

public class PersistenceJPAConfigDeletion extends PersistenceJPAConfigL2Cache {

    public PersistenceJPAConfigDeletion() {
        super();
    }

    @Override
    protected String[] getPackagesToScan() {
        return new String[] { "org.nklkarthi.persistence.deletion.model" };
    }
}