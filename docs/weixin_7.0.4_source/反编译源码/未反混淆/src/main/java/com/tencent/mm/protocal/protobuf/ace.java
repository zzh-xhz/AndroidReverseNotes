package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class ace extends a {
    public String desc;
    public String kbV;
    public String title;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(56795);
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.kbV != null) {
                aVar.e(1, this.kbV);
            }
            if (this.title != null) {
                aVar.e(2, this.title);
            }
            if (this.desc != null) {
                aVar.e(3, this.desc);
            }
            AppMethodBeat.o(56795);
            return 0;
        } else if (i == 1) {
            if (this.kbV != null) {
                f = e.a.a.b.b.a.f(1, this.kbV) + 0;
            } else {
                f = 0;
            }
            if (this.title != null) {
                f += e.a.a.b.b.a.f(2, this.title);
            }
            if (this.desc != null) {
                f += e.a.a.b.b.a.f(3, this.desc);
            }
            AppMethodBeat.o(56795);
            return f;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(56795);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            ace ace = (ace) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    ace.kbV = aVar3.BTU.readString();
                    AppMethodBeat.o(56795);
                    return 0;
                case 2:
                    ace.title = aVar3.BTU.readString();
                    AppMethodBeat.o(56795);
                    return 0;
                case 3:
                    ace.desc = aVar3.BTU.readString();
                    AppMethodBeat.o(56795);
                    return 0;
                default:
                    AppMethodBeat.o(56795);
                    return -1;
            }
        } else {
            AppMethodBeat.o(56795);
            return -1;
        }
    }
}
