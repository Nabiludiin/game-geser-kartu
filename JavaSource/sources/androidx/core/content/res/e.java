package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MyApplication */
public abstract class e {

    /* compiled from: MyApplication */
    static class a {
        static int a(TypedArray typedArray, int i7) {
            return typedArray.getType(i7);
        }
    }

    /* compiled from: MyApplication */
    public interface b {
    }

    /* compiled from: MyApplication */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final d[] f1659a;

        public c(d[] dVarArr) {
            this.f1659a = dVarArr;
        }

        public d[] a() {
            return this.f1659a;
        }
    }

    /* compiled from: MyApplication */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f1660a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1661b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1662c;

        /* renamed from: d, reason: collision with root package name */
        private final String f1663d;

        /* renamed from: e, reason: collision with root package name */
        private final int f1664e;

        /* renamed from: f, reason: collision with root package name */
        private final int f1665f;

        public d(String str, int i7, boolean z7, String str2, int i8, int i9) {
            this.f1660a = str;
            this.f1661b = i7;
            this.f1662c = z7;
            this.f1663d = str2;
            this.f1664e = i8;
            this.f1665f = i9;
        }

        public String a() {
            return this.f1660a;
        }

        public int b() {
            return this.f1665f;
        }

        public int c() {
            return this.f1664e;
        }

        public String d() {
            return this.f1663d;
        }

        public int e() {
            return this.f1661b;
        }

        public boolean f() {
            return this.f1662c;
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.core.content.res.e$e, reason: collision with other inner class name */
    public static final class C0025e implements b {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.core.provider.e f1666a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1667b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1668c;

        /* renamed from: d, reason: collision with root package name */
        private final String f1669d;

        public C0025e(androidx.core.provider.e eVar, int i7, int i8, String str) {
            this.f1666a = eVar;
            this.f1668c = i7;
            this.f1667b = i8;
            this.f1669d = str;
        }

        public int a() {
            return this.f1668c;
        }

        public androidx.core.provider.e b() {
            return this.f1666a;
        }

        public String c() {
            return this.f1669d;
        }

        public int d() {
            return this.f1667b;
        }
    }

    private static int a(TypedArray typedArray, int i7) {
        return a.a(typedArray, i7);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i7) {
        if (i7 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i7);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i8 = 0; i8 < obtainTypedArray.length(); i8++) {
                    int resourceId = obtainTypedArray.getResourceId(i8, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i7)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), y.d.f27504h);
        String string = obtainAttributes.getString(y.d.f27505i);
        String string2 = obtainAttributes.getString(y.d.f27509m);
        String string3 = obtainAttributes.getString(y.d.f27510n);
        int resourceId = obtainAttributes.getResourceId(y.d.f27506j, 0);
        int integer = obtainAttributes.getInteger(y.d.f27507k, 1);
        int integer2 = obtainAttributes.getInteger(y.d.f27508l, 500);
        String string4 = obtainAttributes.getString(y.d.f27511o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new C0025e(new androidx.core.provider.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), y.d.f27512p);
        int i7 = y.d.f27521y;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = y.d.f27514r;
        }
        int i8 = obtainAttributes.getInt(i7, 400);
        int i9 = y.d.f27519w;
        if (!obtainAttributes.hasValue(i9)) {
            i9 = y.d.f27515s;
        }
        boolean z7 = 1 == obtainAttributes.getInt(i9, 0);
        int i10 = y.d.f27522z;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = y.d.f27516t;
        }
        int i11 = y.d.f27520x;
        if (!obtainAttributes.hasValue(i11)) {
            i11 = y.d.f27517u;
        }
        String string = obtainAttributes.getString(i11);
        int i12 = obtainAttributes.getInt(i10, 0);
        int i13 = y.d.f27518v;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = y.d.f27513q;
        }
        int resourceId = obtainAttributes.getResourceId(i13, 0);
        String string2 = obtainAttributes.getString(i13);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i8, z7, string, i12, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i7 = 1;
        while (i7 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i7++;
            } else if (next == 3) {
                i7--;
            }
        }
    }

    private static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
