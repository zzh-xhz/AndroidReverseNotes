package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.support.p057v4.content.WakefulBroadcastReceiver;
import com.google.android.gms.internal.measurement.zzjc;
import com.google.android.gms.internal.measurement.zzjg;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class AppMeasurementService extends Service implements zzjg {
    private zzjc<AppMeasurementService> zzade;

    private final zzjc<AppMeasurementService> zzfq() {
        AppMethodBeat.m2504i(77174);
        if (this.zzade == null) {
            this.zzade = new zzjc(this);
        }
        zzjc zzjc = this.zzade;
        AppMethodBeat.m2505o(77174);
        return zzjc;
    }

    public final boolean callServiceStopSelfResult(int i) {
        AppMethodBeat.m2504i(77181);
        boolean stopSelfResult = stopSelfResult(i);
        AppMethodBeat.m2505o(77181);
        return stopSelfResult;
    }

    public final IBinder onBind(Intent intent) {
        AppMethodBeat.m2504i(77178);
        IBinder onBind = zzfq().onBind(intent);
        AppMethodBeat.m2505o(77178);
        return onBind;
    }

    public final void onCreate() {
        AppMethodBeat.m2504i(77175);
        super.onCreate();
        zzfq().onCreate();
        AppMethodBeat.m2505o(77175);
    }

    public final void onDestroy() {
        AppMethodBeat.m2504i(77176);
        zzfq().onDestroy();
        super.onDestroy();
        AppMethodBeat.m2505o(77176);
    }

    public final void onRebind(Intent intent) {
        AppMethodBeat.m2504i(77180);
        zzfq().onRebind(intent);
        AppMethodBeat.m2505o(77180);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        AppMethodBeat.m2504i(77177);
        int onStartCommand = zzfq().onStartCommand(intent, i, i2);
        AppMethodBeat.m2505o(77177);
        return onStartCommand;
    }

    public final boolean onUnbind(Intent intent) {
        AppMethodBeat.m2504i(77179);
        boolean onUnbind = zzfq().onUnbind(intent);
        AppMethodBeat.m2505o(77179);
        return onUnbind;
    }

    public final void zza(JobParameters jobParameters, boolean z) {
        AppMethodBeat.m2504i(77182);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        AppMethodBeat.m2505o(77182);
        throw unsupportedOperationException;
    }

    public final void zzb(Intent intent) {
        AppMethodBeat.m2504i(77183);
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
        AppMethodBeat.m2505o(77183);
    }
}
