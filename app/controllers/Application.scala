package controllers

import play.api._
import play.api.mvc._
import play.api.db._
import play.api.Play.current

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def test = Action {
    DB.withConnection("h2db1") { con =>
      val sql = "SELECT name FROM TEST "
      val pre = con.prepareStatement(sql)

      val rs = pre.executeQuery()
      while (rs.next()) {
        val name = rs.getString("name").trim

        println("this is reading 1 = "+ name)
      	}		
    }
    
    DB.withConnection("h2db2") { con =>
      val sql = "SELECT name FROM TEST "
      val pre = con.prepareStatement(sql)

      val rs = pre.executeQuery()
      while (rs.next()) {
        val name = rs.getString("name").trim

        println("this is reading 2 = "+ name)
      }}

      
    
  Ok("daone")
  }
}