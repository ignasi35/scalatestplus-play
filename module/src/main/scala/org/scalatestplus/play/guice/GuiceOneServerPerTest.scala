package org.scalatestplus.play.guice

import org.scalatest.{Suite, TestData}
import org.scalatestplus.play.BaseOneServerPerTest
import play.api.Application

trait GuiceOneServerPerTest extends BaseOneServerPerTest with GuiceFakeApplicationFactory { this: Suite =>

  /**
   * Creates new instance of `Application` with parameters set to their defaults.
   *
   * Override this method if you need an `Application` created with non-default parameter values.
   */
  def newAppForTest(testData: TestData): Application = fakeApplication()

}
