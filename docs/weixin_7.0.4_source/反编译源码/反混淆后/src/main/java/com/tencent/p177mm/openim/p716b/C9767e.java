package com.tencent.p177mm.openim.p716b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.network.C1902e;
import com.tencent.p177mm.network.C1918k;
import com.tencent.p177mm.network.C1929q;
import com.tencent.p177mm.openim.room.p266a.C42249a;
import com.tencent.p177mm.p183ai.C1202f;
import com.tencent.p177mm.p183ai.C1207m;
import com.tencent.p177mm.p183ai.C7472b;
import com.tencent.p177mm.p183ai.C7472b.C1196a;
import com.tencent.p177mm.protocal.protobuf.ale;
import com.tencent.p177mm.protocal.protobuf.alf;
import com.tencent.p177mm.sdk.platformtools.C4990ab;

/* renamed from: com.tencent.mm.openim.b.e */
public final class C9767e extends C1207m implements C1918k {
    private final C7472b ehh;
    private C1202f ehi;
    private final String geY;

    public C9767e(String str) {
        AppMethodBeat.m2504i(78846);
        C1196a c1196a = new C1196a();
        c1196a.fsJ = new ale();
        c1196a.fsK = new alf();
        c1196a.uri = "/cgi-bin/micromsg-bin/getopenimchatroomcontact";
        this.ehh = c1196a.acD();
        this.geY = str;
        ((ale) this.ehh.fsG.fsP).gfa = str;
        C4990ab.m7417i("MicroMsg.Openim.NetSceneGetOpenIMChatRoomContact", "get roomname:%s", str);
        AppMethodBeat.m2505o(78846);
    }

    /* renamed from: a */
    public final void mo4498a(int i, int i2, int i3, String str, C1929q c1929q, byte[] bArr) {
        AppMethodBeat.m2504i(78847);
        C4990ab.m7417i("MicroMsg.Openim.NetSceneGetOpenIMChatRoomContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname:%s", Integer.valueOf(i2), Integer.valueOf(i3), str, this.geY);
        if (i2 == 0 && i3 == 0) {
            alf alf = (alf) ((C7472b) c1929q).fsH.fsP;
            if (alf.wqG != null) {
                C42249a.m74599b(alf.wqG);
            }
        }
        if (this.ehi != null) {
            this.ehi.onSceneEnd(i2, i3, str, this);
        }
        AppMethodBeat.m2505o(78847);
    }

    public final int getType() {
        return 407;
    }

    /* renamed from: a */
    public final int mo4456a(C1902e c1902e, C1202f c1202f) {
        AppMethodBeat.m2504i(78848);
        this.ehi = c1202f;
        int a = mo4457a(c1902e, this.ehh, this);
        AppMethodBeat.m2505o(78848);
        return a;
    }
}
