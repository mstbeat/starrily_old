package starrily.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import starrily.bean.SkillSheet;
import starrily.bean.UserInformation;
import starrily.mapper.starrilydb.StarrilyMapper;

/**
 * Serviceクラス.
 * @author yu.yamamoto
 * @version 1.0.0
 */
@Service
public class StarrilyService {

	@Autowired
	StarrilyMapper starrilyMapper;

	/**
	 * DB情報検索.
	 * @param skillSheet スキルシートbeanクラス
	 * @return DB情報
	 */
	public List<SkillSheet> searchProjectDB(SkillSheet skillSheet) {
		return starrilyMapper.searchProjectDB(skillSheet);
	}

	/**
	 * FW/NW情報検索.
	 * @param skillSheet スキルシートbeanクラス
	 * @return FW/NW情報
	 */
	public List<SkillSheet> searchProjectFWNW(SkillSheet skillSheet) {
		return starrilyMapper.searchProjectFWNW(skillSheet);
	}

	/**
	 * OS情報検索.
	 * @param skillSheet スキルシートbeanクラス
	 * @return OS情報
	 */
	public List<SkillSheet> searchProjectOS(SkillSheet skillSheet) {
		return starrilyMapper.searchProjectOS(skillSheet);
	}

	/**
	 * 言語情報検索.
	 * @param skillSheet スキルシートbeanクラス
	 * @return 言語情報
	 */
	public List<SkillSheet> searchProjectLang(SkillSheet skillSheet) {
		return starrilyMapper.searchProjectLang(skillSheet);
	}

	/**
	 * その他情報検索.
	 * @param skillSheet スキルシートbeanクラス
	 * @return その他情報
	 */
	public List<SkillSheet> searchProjectOther(SkillSheet skillSheet) {
		return starrilyMapper.searchProjectOther(skillSheet);
	}

	/**
	 * 案件基本情報取得.
	 * @param skillSheet スキルシートbeanクラス
	 * @return 案件基本情報
	 */
	public List<SkillSheet> searchProject(SkillSheet skillSheet) {
		return starrilyMapper.searchProject(skillSheet);
	}

	/**
	 * 基本情報取得.
	 * @param userId ユーザーID
	 * @return 基本情報
	 */
	public List<SkillSheet> getSkillSheetBasic(String userId) {
		return starrilyMapper.getSkillSheetBasic(userId);
	}

	/**
	 * 案件基本情報取得.
	 * @param userId ユーザーID
	 * @return 案件基本情報
	 */
	public List<SkillSheet> getProjectAll(String userId) {
		return starrilyMapper.getProjectAll(userId);
	}

	/**
	 * 案件基本取得.
	 * @param skillSheet スキルシートbeanクラス
	 * @return 案件基本
	 */
	public List<SkillSheet> getProject(SkillSheet skillSheet) {
		return starrilyMapper.getProject(skillSheet);
	}

	/**
	 * DB情報取得.
	 * @param careerId 経歴ID
	 * @return DB情報
	 */
	public List<SkillSheet> getProjectDB(String careerId) {
		return starrilyMapper.getProjectDB(careerId);
	}

	/**
	 * FW/NW情報取得.
	 * @param careerId 経歴ID
	 * @return FW/NW情報
	 */
	public List<SkillSheet> getProjectFwNw(String careerId) {
		return starrilyMapper.getProjectFwNw(careerId);
	}

	/**
	 * OS情報取得.
	 * @param careerId 経歴ID
	 * @return OS情報
	 */
	public List<SkillSheet> getProjectOS(String careerId) {
		return starrilyMapper.getProjectOS(careerId);

	}

	/**
	 * 言語情報取得.
	 * @param careerId 経歴ID
	 * @return 言語情報
	 */
	public List<SkillSheet> getProjectLang(String careerId) {
		return starrilyMapper.getProjectLang(careerId);
	}

	/**
	 * その他情報取得.
	 * @param careerId 経歴ID
	 * @return その他情報
	 */
	public List<SkillSheet> getProjectOther(String careerId) {
		return starrilyMapper.getProjectOther(careerId);
	}

	/**
	 * 基本情報登録.
	 * @param skillSheet スキルシートbeanクラス
	 */
	public void insertBasicInformation(SkillSheet skillSheet) {
		starrilyMapper.insertBasicInformation(skillSheet);
	}

	/**
	 * 案件基本情報更新.
	 * @param skillSheet スキルシートbeanクラス
	 */
	public void updateProject(SkillSheet skillSheet) {
		starrilyMapper.updateProject(skillSheet);
	}

	/**
	 * 案件基本情報登録.
	 * @param skillSheet スキルシートbeanクラス
	 */
	public void insertProject(SkillSheet skillSheet) {
		starrilyMapper.insertProject(skillSheet);
	}

	/**
	 * DB情報登録.
	 * @param skillSheet スキルシートbeanクラス
	 */
	public void insertProjectDB(SkillSheet skillSheet) {
		starrilyMapper.insertProjectDB(skillSheet);
	}

	/**
	 * FW/NW情報登録.
	 * @param skillSheet スキルシートbeanクラス
	 */
	public void insertProjectFWNW(SkillSheet skillSheet) {
		starrilyMapper.insertProjectFWNW(skillSheet);
	}

	/**
	 * OS情報登録.
	 * @param skillSheet スキルシートbeanクラス
	 */
	public void insertProjectOS(SkillSheet skillSheet) {
		starrilyMapper.insertProjectOS(skillSheet);
	}

	/**
	 * 言語情報登録.
	 * @param skillSheet スキルシートbeanクラス
	 */
	public void insertProjectLang(SkillSheet skillSheet) {
		starrilyMapper.insertProjectLang(skillSheet);
	}

	/**
	 * その他情報登録.
	 * @param skillSheet スキルシートbeanクラス
	 */
	public void insertProjectOther(SkillSheet skillSheet) {
		starrilyMapper.insertProjectOther(skillSheet);
	}

	/**
	 * 案件経歴情報削除.
	 * @param skillSheet スキルシートbeanクラス
	 */
	public void deleteProjectItems(SkillSheet skillSheet) {
		starrilyMapper.deleteProjectItems(skillSheet);
	}

	/**
	 * 案件削除.
	 * @param skillSheet スキルシートbeanクラス
	 */
	public void deleteSkillSheetProject(SkillSheet skillSheet) {
		starrilyMapper.deleteSkillSheetProject(skillSheet);
	}

	/**
	 * ユーザー情報登録.
	 * @param userInformation ユーザー情報beanクラス
	 */
	public void insertUserInformation(UserInformation userInformation) {
		starrilyMapper.insertUserInformation(userInformation);
	}

	/**
	 * ユーザー情報更新.
	 * @param userInformation ユーザー情報beanクラス
	 */
	public void updateUserInformation(UserInformation userInformation) {
		starrilyMapper.updateUserInformation(userInformation);
	}

	/**
	 * ユーザー情報削除.
	 * @param userInformation ユーザー情報beanクラス
	 */
	public void deleteUserInformation(UserInformation userInformation) {
		starrilyMapper.deleteUserInformation(userInformation);
	}

	/**
	 * スキルプルダウンDB情報取得.
	 * @return スキルシートbeanクラス
	 */
	public List<SkillSheet> getPulldownProjectDB() {
		return starrilyMapper.getPulldownProjectDB();
	}

	/**
	 * スキルプルダウンFW/NW情報取得.
	 * @return スキルシートbeanクラス
	 */
	public List<SkillSheet> getPulldownProjectFWNW() {
		return starrilyMapper.getPulldownProjectFWNW();
	}

	/**
	 * スキルプルダウンOS情報取得.
	 * @return スキルシートbeanクラス
	 */
	public List<SkillSheet> getPulldownProjectOS() {
		return starrilyMapper.getPulldownProjectOS();
	}

	/**
	 * スキルプルダウン言語情報取得.
	 * @return スキルシートbeanクラス
	 */
	public List<SkillSheet> getPulldownProjectLang() {
		return starrilyMapper.getPulldownProjectLang();
	}

	/**
	 * スキルプルダウンその他情報取得.
	 * @return スキルシートbeanクラス
	 */
	public List<SkillSheet> getPulldownProjectOther() {
		return starrilyMapper.getPulldownProjectOther();
	}
}
