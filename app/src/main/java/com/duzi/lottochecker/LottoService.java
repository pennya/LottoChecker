package com.duzi.lottochecker;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by KIM on 2018-06-14.
 */

public interface LottoService {
    @GET("common.do")
    Observable<Lotto> getObLottoRoundInfo(@Query("method") String method,
                                          @Query("drwNo") int drwNo);
}
