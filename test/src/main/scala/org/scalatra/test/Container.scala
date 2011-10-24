package org.scalatra.test

trait Container {
  protected def start(): Unit
  protected def stop(): Unit
  protected def baseUrl: String
}
