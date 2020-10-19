package com.kotlin.snowapp.jjgithub

import com.kotlin.snowapp.common.Preference


/**
 * Created by snow on 2020/10/16.
 */
object Settings {
    // 属性代理
    var email: String by Preference(AppContext, "email", "")
    var password: String by Preference(AppContext, "password", "")



}

