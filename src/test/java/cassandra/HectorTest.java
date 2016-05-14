package cassandra;

import junit.framework.TestCase;
import me.prettyprint.hector.api.Cluster;
import me.prettyprint.hector.api.ddl.KeyspaceDefinition;
import me.prettyprint.hector.api.factory.HFactory;


public class HectorTest extends TestCase {
    
    public static void main(String[] args) {
        Cluster cluster = HFactory.getOrCreateCluster("test cluster", "127.0.0.1:9160");
        String keyspaceName = "test3";
        if ((cluster.describeKeyspace(keyspaceName)) == null) {
            KeyspaceDefinition newKeyspaceDef = HFactory.createKeyspaceDefinition(keyspaceName);
            cluster.addKeyspace(newKeyspaceDef, true);
        }
    }
}
