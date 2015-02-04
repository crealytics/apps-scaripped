package de.crealytics.google.appscript.api

case class ApiClass(name: String, tpe: String, methods: Seq[ApiMethod], description: String, parents: Seq[String] = Seq("js.Object"))
