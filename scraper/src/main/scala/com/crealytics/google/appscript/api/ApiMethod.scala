package com.crealytics.google.appscript.api

case class ApiMethod(name: String, parameters: Seq[ApiParam], returnType: String, description: String)

case class ApiParam(name: String, `type`: String, description: String)