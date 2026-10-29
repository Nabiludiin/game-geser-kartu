package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: MyApplication */
public class Guideline extends View {

    /* renamed from: q, reason: collision with root package name */
    private boolean f1177q;

    public Guideline(Context context) {
        super(context);
        this.f1177q = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z7) {
        this.f1177q = z7;
    }

    public void setGuidelineBegin(int i7) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f1177q && bVar.f1119a == i7) {
            return;
        }
        bVar.f1119a = i7;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i7) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f1177q && bVar.f1121b == i7) {
            return;
        }
        bVar.f1121b = i7;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f8) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f1177q && bVar.f1123c == f8) {
            return;
        }
        bVar.f1123c = f8;
        setLayoutParams(bVar);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1177q = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
    }
}
