package com.tencent.p177mm.p823ab;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.compatible.util.C1447g.C1446a;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import p000a.C0220l;
import p000a.p005f.p007b.C25052j;

@C0220l(dWo = {1, 1, 13}, dWp = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\bJ\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, dWq = {"Lcom/tencent/mm/kt/CodeMan;", "", "taskName", "", "(Ljava/lang/String;)V", "testTime", "Lcom/tencent/mm/compatible/util/CodeInfo$TestTime;", "begin", "", "diff", "getdiff", "", "mark", "toString", "libktcomm_release"})
/* renamed from: com.tencent.mm.ab.a */
public final class C8901a {
    public C1446a eOm = new C1446a();
    private final String eOn;

    public C8901a(String str) {
        C25052j.m39376p(str, "taskName");
        AppMethodBeat.m2504i(114168);
        this.eOn = str;
        this.eOm.reset();
        AppMethodBeat.m2505o(114168);
    }

    /* renamed from: SW */
    public final void mo20314SW() {
        AppMethodBeat.m2504i(114166);
        C4990ab.m7416i("MicroMsg.CodeUtil", toString());
        AppMethodBeat.m2505o(114166);
    }

    public final String toString() {
        AppMethodBeat.m2504i(114167);
        String str = "CodeMan task " + this.eOn + " cost : " + this.eOm.mo4908Mr();
        AppMethodBeat.m2505o(114167);
        return str;
    }
}
