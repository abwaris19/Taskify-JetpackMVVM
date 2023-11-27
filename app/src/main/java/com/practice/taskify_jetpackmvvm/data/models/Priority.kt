package com.practice.taskify_jetpackmvvm.data.models

import androidx.compose.ui.graphics.Color
import com.practice.taskify_jetpackmvvm.ui.theme.HighPriorityColor
import com.practice.taskify_jetpackmvvm.ui.theme.LowPriorityColor
import com.practice.taskify_jetpackmvvm.ui.theme.MediumPriorityColor
import com.practice.taskify_jetpackmvvm.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)


}