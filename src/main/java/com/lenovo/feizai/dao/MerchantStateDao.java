package com.lenovo.feizai.dao;

import com.lenovo.feizai.entity.MerchantChange;
import com.lenovo.feizai.entity.MerchantLoaction;
import com.lenovo.feizai.entity.MerchantState;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author feizai
 * @date 2021/4/5 0005 下午 6:08:02
 * @annotation
 */
public interface MerchantStateDao {
    public int addMerchantState(MerchantState state);

    public List<MerchantState> selectAllMerchantState();

    public MerchantState selectCheckInfoByName(String merchant);

    public List<MerchantState> selectMerchantState(String keyword);

    public List<MerchantLoaction> selectUncheckMerchant(String keyword);

    public List<MerchantChange> selectUncheckChangeMerchant(String keyword);

    public List<MerchantState> selectMerchantStateByName(String merchant);

    public int updateCheckInfoByName(MerchantState state);

    public MerchantState findMerchantState(String merchant);

    public int updateParkingState(@Param("merchant") String merchant, @Param("state") String state);

    public int updateByMerchantChange(MerchantChange merchantChange);

    public int readdMerchantStatus(@Param("merchantState") MerchantState merchantState, @Param("oldname") String oldname);
}
