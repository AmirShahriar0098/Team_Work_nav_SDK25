package com.example.team_work_nav_shrk_sdk25

interface Destinations
{
    val route : String
}

object Home : Destinations
{
    override val route: String = "Home"
}

object Second : Destinations
{
    override val route: String = "Second"
}