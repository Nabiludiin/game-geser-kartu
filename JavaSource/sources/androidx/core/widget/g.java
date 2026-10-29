package androidx.core.widget;

import android.widget.ListView;

/* compiled from: MyApplication */
public class g extends a {
    private final ListView I;

    public g(ListView listView) {
        super(listView);
        this.I = listView;
    }

    @Override // androidx.core.widget.a
    public boolean a(int i7) {
        return false;
    }

    @Override // androidx.core.widget.a
    public boolean b(int i7) {
        ListView listView = this.I;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i8 = firstVisiblePosition + childCount;
        if (i7 > 0) {
            if (i8 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i7 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.a
    public void p(int i7, int i8) {
        h.a(this.I, i8);
    }
}
