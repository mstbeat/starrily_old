package starrily.mapper.tksdb;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

/**
 * TKSに接続するMapperクラス
 * @author k.mayu
 *
 */
@Transactional(transactionManager = "txManagerstarrilydb")
@Mapper
public interface TksdbMapper {

}
