package com.tencent.mm.plugin.appbrand.widget.h;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c extends ReplacementSpan {
    private final int backgroundColor;
    private final float eOg;
    private final int paddingLeft;
    private final int paddingRight;
    private final int radius;
    private final String text;
    private final int textColor = -1;

    public c(String str, int i, int i2, int i3, int i4, int i5) {
        AppMethodBeat.i(77509);
        this.eOg = (float) i3;
        this.text = str;
        this.backgroundColor = i4;
        this.radius = i5;
        this.paddingLeft = i;
        this.paddingRight = i2;
        AppMethodBeat.o(77509);
    }

    public final int b(Paint paint) {
        AppMethodBeat.i(77510);
        if (paint == null) {
            paint = new Paint();
        }
        paint.setTextSize(this.eOg);
        int measureText = ((((int) paint.measureText(this.text)) + this.paddingLeft) + this.paddingRight) + (this.radius * 2);
        AppMethodBeat.o(77510);
        return measureText;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        AppMethodBeat.i(77511);
        int b = b(paint);
        AppMethodBeat.o(77511);
        return b;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        AppMethodBeat.i(77512);
        paint.setTextSize(this.eOg);
        paint.setAntiAlias(true);
        RectF rectF = new RectF();
        rectF.left = (float) (((int) f) + this.paddingLeft);
        FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int max = Math.max(0, ((((i5 - i3) - fontMetricsInt.descent) + fontMetricsInt.top) / 2) - this.radius);
        rectF.top = (float) (i3 + max);
        rectF.bottom = (float) (i5 - max);
        rectF.right = (rectF.left + ((float) ((int) paint.measureText(this.text)))) + ((float) (this.radius * 2));
        paint.setColor(this.backgroundColor);
        canvas.drawRoundRect(rectF, (float) this.radius, (float) this.radius, paint);
        paint.setColor(this.textColor);
        canvas.drawText(this.text, rectF.left + ((float) this.radius), (rectF.top + ((float) this.radius)) - ((float) fontMetricsInt.top), paint);
        AppMethodBeat.o(77512);
    }
}
