package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class axu extends a {
    public String kfA;
    public double latitude;
    public double longitude;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(114435);
        int fv;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.f(1, this.latitude);
            aVar.f(2, this.longitude);
            if (this.kfA != null) {
                aVar.e(3, this.kfA);
            }
            AppMethodBeat.o(114435);
            return 0;
        } else if (i == 1) {
            fv = ((e.a.a.b.b.a.fv(1) + 8) + 0) + (e.a.a.b.b.a.fv(2) + 8);
            if (this.kfA != null) {
                fv += e.a.a.b.b.a.f(3, this.kfA);
            }
            AppMethodBeat.o(114435);
            return fv;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (fv = a.getNextFieldNumber(aVar2); fv > 0; fv = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, fv)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(114435);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            axu axu = (axu) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    axu.latitude = Double.longBitsToDouble(aVar3.BTU.eib());
                    AppMethodBeat.o(114435);
                    return 0;
                case 2:
                    axu.longitude = Double.longBitsToDouble(aVar3.BTU.eib());
                    AppMethodBeat.o(114435);
                    return 0;
                case 3:
                    axu.kfA = aVar3.BTU.readString();
                    AppMethodBeat.o(114435);
                    return 0;
                default:
                    AppMethodBeat.o(114435);
                    return -1;
            }
        } else {
            AppMethodBeat.o(114435);
            return -1;
        }
    }
}
