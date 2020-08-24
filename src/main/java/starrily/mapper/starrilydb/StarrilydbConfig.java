package starrily.mapper.starrilydb;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
/**
 * starrilyのDBと接続させるためのコンフィグクラス
 * @author PDA m.kubota
 *
 */
@Configuration
@MapperScan(basePackages = {"starrily.mapper.starrilydb"},sqlSessionFactoryRef = "sqlSessionFactorystarrilydb")
// mapperのあるフォルダの場所
public class StarrilydbConfig {

	 /**
	  * applicationpropatiesのデータソースと紐づける
	  * @return 初期化したDataSourcePropertiesメソッド
	  */
	  @Bean
	  @Primary
	  @ConfigurationProperties(prefix = "spring.datasource.starrilydb")
	  public DataSourceProperties starrilydbProperties() {
	    return new DataSourceProperties();
	  }

	/**
	 * カスタム DataSourcePropertiesを再定義する
	 * @param properties
	 * @return 明示的トランザクション
	 */
	  @Bean(name = {"starrilydb"})
	  @Primary
	  public DataSource starrilydb(
	      @Qualifier("starrilydbProperties") DataSourceProperties properties) {
	    return properties.initializeDataSourceBuilder().build();
	  }

	  /**
	   * カスタム DataSourcePropertiesを再定義する
	   * @param starrilydb applicationpropatiesのstarrilyDB
	   * @return カスタマイズされたPlatformTransactionManager
	   */
	  @Bean(name = {"txManagerstarrilydb"})// mapperに書くTransactional
	  @Primary
	  public PlatformTransactionManager txManagerstarrilydb(DataSource starrilydb) {
	    return new DataSourceTransactionManager(starrilydb);
	  }

	  /**
	   * Mybatisに指定したDBをマッピングする
	   * @param starrilydb starrilydb applicationpropatiesのstarrilyDB
	   * @return Springが生成するオブジェクト
	   * @throws Exception 予期しない例外
	   */
	  @Bean(name = {"sqlSessionFactorystarrilydb"})
	  @Primary
	  public SqlSessionFactory sqlSessionFactory(@Qualifier("starrilydb") DataSource starrilydb)
	      throws Exception {
	    SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
	    sqlSessionFactory.setDataSource(starrilydb);
	    return (SqlSessionFactory) sqlSessionFactory.getObject();
	  }
}
