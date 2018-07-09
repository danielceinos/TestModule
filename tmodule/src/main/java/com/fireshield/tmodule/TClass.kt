package com.fireshield.tmodule

import io.reactivex.Single

/**
 * Created by Daniel S on 10/07/2018.
 */
class TClass{

  fun obObservable() : Single<String> {
      return Single.just("holi")
  }
}