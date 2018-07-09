package com.fireshield.tmodule

import com.fireshield.dependencylibrary.TDClass

/**
 * Created by Daniel S on 10/07/2018.
 */
class TClass {

  fun execute(): String {
    val tdClass = TDClass()
    return tdClass.printVersion()
  }
}