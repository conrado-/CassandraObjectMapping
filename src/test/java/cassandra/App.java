package cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.datastax.driver.mapping.Mapper;
import com.datastax.driver.mapping.MappingManager;

public class App {
	public static void main(String[] args) {
		Cluster cluster = Cluster.builder().addContactPoints("127.0.0.1").withPort(9042).build();
		Session session = cluster.connect();

		// String cqlStatement =
		// "SELECT * FROM \"dev_global_test\".\"g_users\";";
		// session.execute(cqlStatement);
		// for (Row row : session.execute(cqlStatement)) {
		// System.out.println(row.toString());
		// }
		// System.out.println("Done");

		MappingManager manager = new MappingManager(session);
		Mapper<UserVo> mapper = manager.mapper(UserVo.class);

		UserVo user = mapper.get(10044, 11395L);
		System.out.println(user.getFirstName());

		System.exit(0);
	}
}