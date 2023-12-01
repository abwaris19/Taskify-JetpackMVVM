package com.practice.taskify_jetpackmvvm.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.practice.taskify_jetpackmvvm.util.Action
import com.practice.taskify_jetpackmvvm.util.constants.TASK_ARGUMENT_KEY
import com.practice.taskify_jetpackmvvm.util.constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigateToTaskScreen: (Action) -> Unit
){
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY){
            type = NavType.IntType
        })
    ){

    }
}