package de.crealytics.google.appscript.api

case class ApiClass(name: String, `type`: String, methods: Seq[ApiMethod], description: String, parents: Seq[String] = Seq("js.Object"))
