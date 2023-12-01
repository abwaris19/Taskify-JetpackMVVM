package com.practice.taskify_jetpackmvvm.navigation

import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.practice.taskify_jetpackmvvm.util.Action
import com.practice.taskify_jetpackmvvm.util.constants

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = {action ->
            navController.navigate("list/${action.name}"){
                popUpTo(constants.LIST_SCREEN) { inclusive = true}
            }
    }

    val task: (Int) -> Unit = {taskId ->
        navController.navigate(route = "task/$taskId")
    }

}