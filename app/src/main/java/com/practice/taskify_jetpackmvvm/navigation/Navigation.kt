package com.practice.taskify_jetpackmvvm.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.practice.taskify_jetpackmvvm.navigation.destinations.listComposable
import com.practice.taskify_jetpackmvvm.navigation.destinations.taskComposable
import com.practice.taskify_jetpackmvvm.util.constants.LIST_SCREEN

@Composable

fun SetupNavigation(
    navController: NavHostController
){
    val screen = remember(navController){
        Screens(navController = navController )
    }

    NavHost(navController = navController, startDestination = LIST_SCREEN){

        listComposable(
            navigateToTaskScreen = screen.task
        )

        taskComposable(
            navigateToTaskScreen = screen.list
        )
    }
}