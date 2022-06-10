package com.apolloclinicfsm.features.micro_learning.presentation

import android.app.IntentService
import android.content.Intent
import com.apolloclinicfsm.R
import com.apolloclinicfsm.app.NetworkConstant
import com.apolloclinicfsm.app.Pref
import com.apolloclinicfsm.app.utils.AppUtils
import com.apolloclinicfsm.app.utils.Toaster
import com.apolloclinicfsm.base.BaseResponse
import com.apolloclinicfsm.base.presentation.BaseActivity
import com.apolloclinicfsm.features.dashboard.presentation.DashboardActivity
import com.apolloclinicfsm.features.micro_learning.api.MicroLearningRepoProvider
import com.elvishew.xlog.XLog
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class FileOpeningTimeIntentService : IntentService("") {

    override fun onHandleIntent(p0: Intent?) {

        val id = p0?.getStringExtra("id")
        val startTime = p0?.getStringExtra("start_time")

        val repository = MicroLearningRepoProvider.microLearningRepoProvider()
        BaseActivity.compositeDisposable.add(
                repository.updateFileOpeningTime(id!!, startTime!!)
                        .subscribe({ result ->
                            val response = result as BaseResponse
                            XLog.d("UPDATE FILE OPENING TIME: " + "RESPONSE : " + response.status + "\n" + "Time : " + AppUtils.getCurrentDateTime() + ", USER :" + Pref.user_name + ",MESSAGE : " + response.message)
                        }, { error ->
                            XLog.d("UPDATE FILE OPENING TIME: " + "ERROR : " + "\n" + "Time : " + AppUtils.getCurrentDateTime() + ", USER :" + Pref.user_name + ",MESSAGE : " + error.localizedMessage)
                            error.printStackTrace()
                        })
        )
    }
}