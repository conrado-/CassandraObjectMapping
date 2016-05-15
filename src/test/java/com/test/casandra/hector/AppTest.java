package com.test.casandra.hector;

import org.junit.Test;

import me.prettyprint.hector.api.Cluster;
import me.prettyprint.hector.api.ddl.KeyspaceDefinition;
import me.prettyprint.hector.api.factory.HFactory;

public class AppTest {
    @Test
    public void testApp() {
        Cluster cluster = HFactory.getOrCreateCluster("test cluster", "127.0.0.1:9160");
        String keyspaceName = "test3";
        if ((cluster.describeKeyspace(keyspaceName)) == null) {
            KeyspaceDefinition newKeyspaceDef = HFactory.createKeyspaceDefinition(keyspaceName);
            cluster.addKeyspace(newKeyspaceDef, true);
        }
    }
}
