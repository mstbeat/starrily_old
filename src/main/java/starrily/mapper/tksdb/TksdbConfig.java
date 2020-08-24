package starrily.mapper.tksdb;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * TKSのDBと接続させるためのコンフィグクラス
 * @author PDA m.kubota
 *
 */
@Configuration
@MapperScan(basePackages = {"starrily.mapper.tksdb"},sqlSessionFactoryRef = "sqlSessionFactorytksdb")
public class TksdbConfig {

	 /**
	  * applicationpropatiesのデータソースと紐づける
	  * @return 初期化したDataSourcePropertiesメソッド
	  */
	  @Bean
	  @ConfigurationProperties(prefix = "spring.datasource.tksdb")
	  public DataSourceProperties tksdbProperties() {
	    return new DataSourceProperties();
	  }

	/**
	 * カスタム DataSourcePropertiesを再定義する
	 * @param properties
	 * @return 明示的トランザクション
	 */
	  @Bean(name = {"tksdb"})
	  public DataSource tksdb(
	      @Qualifier("tksdbProperties") DataSourceProperties properties) {
	    return properties.initializeDataSourceBuilder().build();
	  }

	  /**
	   * カスタム DataSourcePropertiesを再定義する
	   * @param tksdb applicationpropatiesのTtksdb
	   * @return カスタマイズされたPlatformTransactionManager
	   */
	  @Bean(name = {"txManagertksdb"})
	  public PlatformTransactionManager txManagertksdb(@Qualifier("tksdb") DataSource tksdb) {
	    return new DataSourceTransactionManager(tksdb);
	  }

	  /**
	   * Mybatisに指定したDBをマッピングする
	   * @param tksdb tksdb applicationpropatiesのtksdb
	   * @return Springが生成するオブジェクト
	   * @throws Exception 予期しない例外
	   */
	  @Bean(name = {"sqlSessionFactorytksdb"})
	  public SqlSessionFactory sqlSessionFactory(@Qualifier("tksdb") DataSource tksdb)
	      throws Exception {
	    SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
	    sqlSessionFactory.setDataSource(tksdb);
	    return (SqlSessionFactory) sqlSessionFactory.getObject();
	  }

}
