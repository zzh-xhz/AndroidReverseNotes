package com.google.android.gms.wearable.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.NodeClient;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class zzfl extends NodeClient {
    private final NodeApi zzem = new zzfg();

    public zzfl(Activity activity, Settings settings) {
        super(activity, settings);
        AppMethodBeat.i(71321);
        AppMethodBeat.o(71321);
    }

    public zzfl(Context context, Settings settings) {
        super(context, settings);
        AppMethodBeat.i(71320);
        AppMethodBeat.o(71320);
    }

    public final Task<List<Node>> getConnectedNodes() {
        AppMethodBeat.i(71323);
        Task toTask = PendingResultUtil.toTask(this.zzem.getConnectedNodes(asGoogleApiClient()), zzfn.zzbx);
        AppMethodBeat.o(71323);
        return toTask;
    }

    public final Task<Node> getLocalNode() {
        AppMethodBeat.i(71322);
        Task toTask = PendingResultUtil.toTask(this.zzem.getLocalNode(asGoogleApiClient()), zzfm.zzbx);
        AppMethodBeat.o(71322);
        return toTask;
    }
}
