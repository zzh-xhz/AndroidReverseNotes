package com.tencent.mm.plugin.wallet.pay.a.d;

import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.s;

public final class e extends f {
    public e(s sVar, Orders orders) {
        super(sVar, orders);
    }

    public final String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/ts_verify";
    }

    public final int ZU() {
        return 1699;
    }
}
