package de.crealytics.google.appscript.api

case class ApiClass(name: String, `type`: String, methods: Map[String, ApiMethod], description: String, parents: Seq[String] = Seq("js.Object"))
