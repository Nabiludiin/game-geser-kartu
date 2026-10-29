package w0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: MyApplication */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f27020a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f27021b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f27022c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f27023d;

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f27024a;

        /* renamed from: b, reason: collision with root package name */
        public final String f27025b;

        /* renamed from: c, reason: collision with root package name */
        public final int f27026c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f27027d;

        /* renamed from: e, reason: collision with root package name */
        public final int f27028e;

        /* renamed from: f, reason: collision with root package name */
        public final String f27029f;

        /* renamed from: g, reason: collision with root package name */
        private final int f27030g;

        public a(String str, String str2, boolean z7, int i7, String str3, int i8) {
            this.f27024a = str;
            this.f27025b = str2;
            this.f27027d = z7;
            this.f27028e = i7;
            this.f27026c = a(str2);
            this.f27029f = str3;
            this.f27030g = i8;
        }

        private static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f27028e != aVar.f27028e || !this.f27024a.equals(aVar.f27024a) || this.f27027d != aVar.f27027d) {
                    return false;
                }
                if (this.f27030g == 1 && aVar.f27030g == 2 && (str3 = this.f27029f) != null && !str3.equals(aVar.f27029f)) {
                    return false;
                }
                if (this.f27030g == 2 && aVar.f27030g == 1 && (str2 = aVar.f27029f) != null && !str2.equals(this.f27029f)) {
                    return false;
                }
                int i7 = this.f27030g;
                if ((i7 == 0 || i7 != aVar.f27030g || ((str = this.f27029f) == null ? aVar.f27029f == null : str.equals(aVar.f27029f))) && this.f27026c == aVar.f27026c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f27024a.hashCode() * 31) + this.f27026c) * 31) + (this.f27027d ? 1231 : 1237)) * 31) + this.f27028e;
        }

        public String toString() {
            return "Column{name='" + this.f27024a + "', type='" + this.f27025b + "', affinity='" + this.f27026c + "', notNull=" + this.f27027d + ", primaryKeyPosition=" + this.f27028e + ", defaultValue='" + this.f27029f + "'}";
        }
    }

    /* compiled from: MyApplication */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f27031a;

        /* renamed from: b, reason: collision with root package name */
        public final String f27032b;

        /* renamed from: c, reason: collision with root package name */
        public final String f27033c;

        /* renamed from: d, reason: collision with root package name */
        public final List f27034d;

        /* renamed from: e, reason: collision with root package name */
        public final List f27035e;

        public b(String str, String str2, String str3, List list, List list2) {
            this.f27031a = str;
            this.f27032b = str2;
            this.f27033c = str3;
            this.f27034d = Collections.unmodifiableList(list);
            this.f27035e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f27031a.equals(bVar.f27031a) && this.f27032b.equals(bVar.f27032b) && this.f27033c.equals(bVar.f27033c) && this.f27034d.equals(bVar.f27034d)) {
                return this.f27035e.equals(bVar.f27035e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f27031a.hashCode() * 31) + this.f27032b.hashCode()) * 31) + this.f27033c.hashCode()) * 31) + this.f27034d.hashCode()) * 31) + this.f27035e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f27031a + "', onDelete='" + this.f27032b + "', onUpdate='" + this.f27033c + "', columnNames=" + this.f27034d + ", referenceColumnNames=" + this.f27035e + '}';
        }
    }

    /* compiled from: MyApplication */
    static class c implements Comparable {

        /* renamed from: q, reason: collision with root package name */
        final int f27036q;

        /* renamed from: r, reason: collision with root package name */
        final int f27037r;

        /* renamed from: s, reason: collision with root package name */
        final String f27038s;

        /* renamed from: t, reason: collision with root package name */
        final String f27039t;

        c(int i7, int i8, String str, String str2) {
            this.f27036q = i7;
            this.f27037r = i8;
            this.f27038s = str;
            this.f27039t = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i7 = this.f27036q - cVar.f27036q;
            return i7 == 0 ? this.f27037r - cVar.f27037r : i7;
        }
    }

    /* compiled from: MyApplication */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f27040a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f27041b;

        /* renamed from: c, reason: collision with root package name */
        public final List f27042c;

        public d(String str, boolean z7, List list) {
            this.f27040a = str;
            this.f27041b = z7;
            this.f27042c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f27041b == dVar.f27041b && this.f27042c.equals(dVar.f27042c)) {
                return this.f27040a.startsWith("index_") ? dVar.f27040a.startsWith("index_") : this.f27040a.equals(dVar.f27040a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f27040a.startsWith("index_") ? -1184239155 : this.f27040a.hashCode()) * 31) + (this.f27041b ? 1 : 0)) * 31) + this.f27042c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f27040a + "', unique=" + this.f27041b + ", columns=" + this.f27042c + '}';
        }
    }

    public f(String str, Map map, Set set, Set set2) {
        this.f27020a = str;
        this.f27021b = Collections.unmodifiableMap(map);
        this.f27022c = Collections.unmodifiableSet(set);
        this.f27023d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static f a(x0.b bVar, String str) {
        return new f(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }

    private static Map b(x0.b bVar, String str) {
        Cursor i02 = bVar.i0("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (i02.getColumnCount() > 0) {
                int columnIndex = i02.getColumnIndex("name");
                int columnIndex2 = i02.getColumnIndex("type");
                int columnIndex3 = i02.getColumnIndex("notnull");
                int columnIndex4 = i02.getColumnIndex("pk");
                int columnIndex5 = i02.getColumnIndex("dflt_value");
                while (i02.moveToNext()) {
                    String string = i02.getString(columnIndex);
                    hashMap.put(string, new a(string, i02.getString(columnIndex2), i02.getInt(columnIndex3) != 0, i02.getInt(columnIndex4), i02.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            i02.close();
        }
    }

    private static List c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < count; i7++) {
            cursor.moveToPosition(i7);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set d(x0.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor i02 = bVar.i0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = i02.getColumnIndex("id");
            int columnIndex2 = i02.getColumnIndex("seq");
            int columnIndex3 = i02.getColumnIndex("table");
            int columnIndex4 = i02.getColumnIndex("on_delete");
            int columnIndex5 = i02.getColumnIndex("on_update");
            List<c> c8 = c(i02);
            int count = i02.getCount();
            for (int i7 = 0; i7 < count; i7++) {
                i02.moveToPosition(i7);
                if (i02.getInt(columnIndex2) == 0) {
                    int i8 = i02.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : c8) {
                        if (cVar.f27036q == i8) {
                            arrayList.add(cVar.f27038s);
                            arrayList2.add(cVar.f27039t);
                        }
                    }
                    hashSet.add(new b(i02.getString(columnIndex3), i02.getString(columnIndex4), i02.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            i02.close();
            return hashSet;
        } catch (Throwable th) {
            i02.close();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static d e(x0.b bVar, String str, boolean z7) {
        Cursor i02 = bVar.i0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = i02.getColumnIndex("seqno");
            int columnIndex2 = i02.getColumnIndex("cid");
            int columnIndex3 = i02.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (i02.moveToNext()) {
                    if (i02.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(i02.getInt(columnIndex)), i02.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                d dVar = new d(str, z7, arrayList);
                i02.close();
                return dVar;
            }
            i02.close();
            return null;
        } catch (Throwable th) {
            i02.close();
            throw th;
        }
    }

    private static Set f(x0.b bVar, String str) {
        Cursor i02 = bVar.i0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = i02.getColumnIndex("name");
            int columnIndex2 = i02.getColumnIndex("origin");
            int columnIndex3 = i02.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (i02.moveToNext()) {
                    if ("c".equals(i02.getString(columnIndex2))) {
                        String string = i02.getString(columnIndex);
                        boolean z7 = true;
                        if (i02.getInt(columnIndex3) != 1) {
                            z7 = false;
                        }
                        d e8 = e(bVar, string, z7);
                        if (e8 == null) {
                            return null;
                        }
                        hashSet.add(e8);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            i02.close();
        }
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f27020a;
        if (str == null ? fVar.f27020a != null : !str.equals(fVar.f27020a)) {
            return false;
        }
        Map map = this.f27021b;
        if (map == null ? fVar.f27021b != null : !map.equals(fVar.f27021b)) {
            return false;
        }
        Set set2 = this.f27022c;
        if (set2 == null ? fVar.f27022c != null : !set2.equals(fVar.f27022c)) {
            return false;
        }
        Set set3 = this.f27023d;
        if (set3 == null || (set = fVar.f27023d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f27020a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f27021b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f27022c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f27020a + "', columns=" + this.f27021b + ", foreignKeys=" + this.f27022c + ", indices=" + this.f27023d + '}';
    }
}
