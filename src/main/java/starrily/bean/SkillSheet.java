package starrily.bean;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


@Data
public class SkillSheet implements Serializable {

	/** シリアルバージョンUID. */
	private static final long serialVersionUID = -5549487585343137022L;

	/** DBの全ての情報　*/
	private String AllDb;
	/** FwNwの全ての情報　*/
	private String AllFwNw;
	/** Osの全ての情報　*/
	private String AllOs;
	/** 言語の全ての情報　*/
	private String AllLang;
	/** その他の全ての情報　*/
	private String AllOther;

	/** 権限　*/
	private int userRole;

	/** ユーザーID */
	private int userId;
	/** 経歴ID */
	private int careerId;
	/** 氏名 */
	private String userName;
	/** フリガナ */
	private String userPhonetic;
	/** イニシャルネーム */
	@NotBlank(message= "{EMSG001}")
	@Pattern(regexp = "[a-zA-Z0-9.]*", message= "{EMSG005}") 
	@Size(max = 3, message= "{EMSG009}")
	private String userInitialName;
	/** 性別 */
	private String userSex;
	/** 生年月日 */
	@NotNull(message= "{EMSG001}")
	@DateTimeFormat(pattern="yyyy-MM-dd")
//	@DateExists
	private Date userBirthday;

	/** 最終学歴 */
	private String userFinalEducation;
	/** 現住所 */
	@NotBlank(message= "{EMSG001}")
	@Size(max = 20, message= "{EMSG003}")
	private String userAddress;

	/** 年齢のカラム追加 */
	private int userAge;

	/** 最寄駅_線 */
	@NotBlank(message= "{EMSG001}")
	@Size(max = 20, message= "{EMSG003}")
	private String userStationLine;
	/** 最寄駅_駅 */
	@NotBlank(message= "{EMSG001}")
	@Size(max = 20, message= "{EMSG003}")
	private String userStation;
	/** アピールポイント */
	@NotBlank(message= "{EMSG001}")
	@Size(max = 1000, message= "{EMSG003}")
	private String userAppeal;
	/** 保有資格 */
	@Size(max = 1000, message= "{EMSG003}")
	private String userCertification;
	/** 備考 */
	@Size(max = 500, message= "{EMSG003}")
	private String userRemarks;
	/** 開始年月 */
	private String startDate;
	/** 終了年月 */
	private String finishDate;
	/** 期間 */
	private int periodDate;
	/** 業務名 */
	private String businessName;
	/** 業界 */
	private String industry;
	/** チーム人数 */
	private int teamNumber;
	/** ポジション */
	private String position;
	/** 担当フェーズ */
	private String chargePhase;
	/** 業務内容 */
	private String businessContent;

	/** データベース 名前＋バージョン */
	private String dbAll;
	/** データベース 名前 */
	private String db;
	/** データベース 名前 画面から配列で受け取る用. */
	private String[] dbArray;
	/** データベース バージョン */
	private String dbVer;
	/** データベース　バージョン 画面から配列で受け取る用. */
	private String[] dbVerArray;
	/** データベース 期間 */
	private int dbPeriod;

	/** FW_NW 名前＋バージョン */
	private String fwNwAll;
	/** FW_NW 名前 */
	private String fwNw;
	/** FW_NW 名前 画面から配列で受け取る用. */
	private String[] fwNwArray;
	/** FW_NW バージョン */
	private String fwNwVer;
	/** FW_NW バージョン 画面から配列で受け取る用. */
	private String[] fwNwVerArray;
	/** FW_NW 期間 */
	private int fwNwPeriod;

	/** 言語 名前＋バージョン */
	private String languageAll;
	/** 言語 名前 */
	private String language;
	/** 言語 名前 画面から配列で受け取る用. */
	private String[] languageArray;
	/** 言語 バージョン */
	private String languageVer;
	/** 言語 バージョン 画面から配列で受け取る用. */
	private String[] languageVerArray;
	/** 言語 期間 */
	private int languagePeriod;

	/** OS 名前＋バージョン */
	private String osAll;
	/** OS 名前 */
	private String os;
	/** os 名前　画面から配列で受け取る用 */
	private String[] osArray;
	/** OS バージョン */
	private String osVer;
	/**  os バージョン 画面から配列で受け取る用 */
	private String[] osVerArray;
	/** OS 期間 */
	private int osPeriod;

	/** その他 名前＋バージョン */
	private String otherAll;
	/** その他 名前 */
	private String other;
	/**  その他 名前 画面から配列で受け取る用*/
	private String[] otherArray;
	/** その他 バージョン */
	private String otherVer;
	/**  その他 バージョン 画面から配列で受け取る用*/
	private String[] otherVerArray;
	/** その他 期間 */
	private int otherPeriod;

	/** チーム人数(文字列) */
	private String teamNumberString;
	/** 担当フェーズ 画面からcontrollerへ渡す用.*/
	private String checkboxfaze;

	/** 登録日時 */
	private String registeredDate;
	/** 更新日時 */
	private String updateDate;
	/** 削除フラグ */
	private String deleteFlg;

}
