package androidx.core.widget;

import android.widget.ListView;

/* compiled from: MyApplication */
public abstract class h {

    /* compiled from: MyApplication */
    static class a {
        static boolean a(ListView listView, int i7) {
            return listView.canScrollList(i7);
        }

        static void b(ListView listView, int i7) {
            listView.scrollListBy(i7);
        }
    }

    public static void a(ListView listView, int i7) {
        a.b(listView, i7);
    }
}
