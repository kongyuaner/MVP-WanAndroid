package com.zs.wanandroid.ui.Integral

import com.example.baselibrary.base.IBasePresenter
import com.example.baselibrary.base.IBaseView
import com.zs.wanandroid.entity.IntegralRecordEntity


/**
 * des 积分
 * @author zs
 * @date 2020-03-17
 */
interface IntegralContract {

    interface View:IBaseView{
        fun showList(t: IntegralRecordEntity)

    }

    interface Presenter<T>:IBasePresenter<View>{
        fun loadData(pageNum:Int)

    }
}