package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MyApplication */
public class e {

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f1221f = {0, 4, 8};

    /* renamed from: g, reason: collision with root package name */
    private static SparseIntArray f1222g = new SparseIntArray();

    /* renamed from: h, reason: collision with root package name */
    private static SparseIntArray f1223h = new SparseIntArray();

    /* renamed from: a, reason: collision with root package name */
    public String f1224a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f1225b = 0;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f1226c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private boolean f1227d = true;

    /* renamed from: e, reason: collision with root package name */
    private HashMap f1228e = new HashMap();

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f1229a;

        /* renamed from: b, reason: collision with root package name */
        String f1230b;

        /* renamed from: c, reason: collision with root package name */
        public final d f1231c = new d();

        /* renamed from: d, reason: collision with root package name */
        public final c f1232d = new c();

        /* renamed from: e, reason: collision with root package name */
        public final b f1233e = new b();

        /* renamed from: f, reason: collision with root package name */
        public final C0019e f1234f = new C0019e();

        /* renamed from: g, reason: collision with root package name */
        public HashMap f1235g = new HashMap();

        /* renamed from: h, reason: collision with root package name */
        C0018a f1236h;

        /* compiled from: MyApplication */
        /* renamed from: androidx.constraintlayout.widget.e$a$a, reason: collision with other inner class name */
        static class C0018a {

            /* renamed from: a, reason: collision with root package name */
            int[] f1237a = new int[10];

            /* renamed from: b, reason: collision with root package name */
            int[] f1238b = new int[10];

            /* renamed from: c, reason: collision with root package name */
            int f1239c = 0;

            /* renamed from: d, reason: collision with root package name */
            int[] f1240d = new int[10];

            /* renamed from: e, reason: collision with root package name */
            float[] f1241e = new float[10];

            /* renamed from: f, reason: collision with root package name */
            int f1242f = 0;

            /* renamed from: g, reason: collision with root package name */
            int[] f1243g = new int[5];

            /* renamed from: h, reason: collision with root package name */
            String[] f1244h = new String[5];

            /* renamed from: i, reason: collision with root package name */
            int f1245i = 0;

            /* renamed from: j, reason: collision with root package name */
            int[] f1246j = new int[4];

            /* renamed from: k, reason: collision with root package name */
            boolean[] f1247k = new boolean[4];

            /* renamed from: l, reason: collision with root package name */
            int f1248l = 0;

            C0018a() {
            }

            void a(int i7, float f8) {
                int i8 = this.f1242f;
                int[] iArr = this.f1240d;
                if (i8 >= iArr.length) {
                    this.f1240d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1241e;
                    this.f1241e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1240d;
                int i9 = this.f1242f;
                iArr2[i9] = i7;
                float[] fArr2 = this.f1241e;
                this.f1242f = i9 + 1;
                fArr2[i9] = f8;
            }

            void b(int i7, int i8) {
                int i9 = this.f1239c;
                int[] iArr = this.f1237a;
                if (i9 >= iArr.length) {
                    this.f1237a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1238b;
                    this.f1238b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1237a;
                int i10 = this.f1239c;
                iArr3[i10] = i7;
                int[] iArr4 = this.f1238b;
                this.f1239c = i10 + 1;
                iArr4[i10] = i8;
            }

            void c(int i7, String str) {
                int i8 = this.f1245i;
                int[] iArr = this.f1243g;
                if (i8 >= iArr.length) {
                    this.f1243g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1244h;
                    this.f1244h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1243g;
                int i9 = this.f1245i;
                iArr2[i9] = i7;
                String[] strArr2 = this.f1244h;
                this.f1245i = i9 + 1;
                strArr2[i9] = str;
            }

            void d(int i7, boolean z7) {
                int i8 = this.f1248l;
                int[] iArr = this.f1246j;
                if (i8 >= iArr.length) {
                    this.f1246j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1247k;
                    this.f1247k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1246j;
                int i9 = this.f1248l;
                iArr2[i9] = i7;
                boolean[] zArr2 = this.f1247k;
                this.f1248l = i9 + 1;
                zArr2[i9] = z7;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i7, ConstraintLayout.b bVar) {
            this.f1229a = i7;
            b bVar2 = this.f1233e;
            bVar2.f1268j = bVar.f1127e;
            bVar2.f1270k = bVar.f1129f;
            bVar2.f1272l = bVar.f1131g;
            bVar2.f1274m = bVar.f1133h;
            bVar2.f1276n = bVar.f1135i;
            bVar2.f1278o = bVar.f1137j;
            bVar2.f1280p = bVar.f1139k;
            bVar2.f1282q = bVar.f1141l;
            bVar2.f1284r = bVar.f1143m;
            bVar2.f1285s = bVar.f1145n;
            bVar2.f1286t = bVar.f1147o;
            bVar2.f1287u = bVar.f1155s;
            bVar2.f1288v = bVar.f1157t;
            bVar2.f1289w = bVar.f1159u;
            bVar2.f1290x = bVar.f1161v;
            bVar2.f1291y = bVar.G;
            bVar2.f1292z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.f1149p;
            bVar2.C = bVar.f1151q;
            bVar2.D = bVar.f1153r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.f1264h = bVar.f1123c;
            bVar2.f1260f = bVar.f1119a;
            bVar2.f1262g = bVar.f1121b;
            bVar2.f1256d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f1258e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.f1277n0 = bVar.f1120a0;
            bVar2.f1279o0 = bVar.f1122b0;
            bVar2.Z = bVar.P;
            bVar2.f1251a0 = bVar.Q;
            bVar2.f1253b0 = bVar.T;
            bVar2.f1255c0 = bVar.U;
            bVar2.f1257d0 = bVar.R;
            bVar2.f1259e0 = bVar.S;
            bVar2.f1261f0 = bVar.V;
            bVar2.f1263g0 = bVar.W;
            bVar2.f1275m0 = bVar.f1124c0;
            bVar2.P = bVar.f1165x;
            bVar2.R = bVar.f1167z;
            bVar2.O = bVar.f1163w;
            bVar2.Q = bVar.f1166y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.f1283q0 = bVar.f1126d0;
            bVar2.L = bVar.getMarginEnd();
            this.f1233e.M = bVar.getMarginStart();
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f1233e;
            bVar.f1127e = bVar2.f1268j;
            bVar.f1129f = bVar2.f1270k;
            bVar.f1131g = bVar2.f1272l;
            bVar.f1133h = bVar2.f1274m;
            bVar.f1135i = bVar2.f1276n;
            bVar.f1137j = bVar2.f1278o;
            bVar.f1139k = bVar2.f1280p;
            bVar.f1141l = bVar2.f1282q;
            bVar.f1143m = bVar2.f1284r;
            bVar.f1145n = bVar2.f1285s;
            bVar.f1147o = bVar2.f1286t;
            bVar.f1155s = bVar2.f1287u;
            bVar.f1157t = bVar2.f1288v;
            bVar.f1159u = bVar2.f1289w;
            bVar.f1161v = bVar2.f1290x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.f1165x = bVar2.P;
            bVar.f1167z = bVar2.R;
            bVar.G = bVar2.f1291y;
            bVar.H = bVar2.f1292z;
            bVar.f1149p = bVar2.B;
            bVar.f1151q = bVar2.C;
            bVar.f1153r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.f1120a0 = bVar2.f1277n0;
            bVar.f1122b0 = bVar2.f1279o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f1251a0;
            bVar.T = bVar2.f1253b0;
            bVar.U = bVar2.f1255c0;
            bVar.R = bVar2.f1257d0;
            bVar.S = bVar2.f1259e0;
            bVar.V = bVar2.f1261f0;
            bVar.W = bVar2.f1263g0;
            bVar.Z = bVar2.G;
            bVar.f1123c = bVar2.f1264h;
            bVar.f1119a = bVar2.f1260f;
            bVar.f1121b = bVar2.f1262g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f1256d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f1258e;
            String str = bVar2.f1275m0;
            if (str != null) {
                bVar.f1124c0 = str;
            }
            bVar.f1126d0 = bVar2.f1283q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.f1233e.L);
            bVar.a();
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f1233e.a(this.f1233e);
            aVar.f1232d.a(this.f1232d);
            aVar.f1231c.a(this.f1231c);
            aVar.f1234f.a(this.f1234f);
            aVar.f1229a = this.f1229a;
            aVar.f1236h = this.f1236h;
            return aVar;
        }
    }

    /* compiled from: MyApplication */
    public static class b {

        /* renamed from: r0, reason: collision with root package name */
        private static SparseIntArray f1249r0;

        /* renamed from: d, reason: collision with root package name */
        public int f1256d;

        /* renamed from: e, reason: collision with root package name */
        public int f1258e;

        /* renamed from: k0, reason: collision with root package name */
        public int[] f1271k0;

        /* renamed from: l0, reason: collision with root package name */
        public String f1273l0;

        /* renamed from: m0, reason: collision with root package name */
        public String f1275m0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f1250a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1252b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1254c = false;

        /* renamed from: f, reason: collision with root package name */
        public int f1260f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f1262g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f1264h = -1.0f;

        /* renamed from: i, reason: collision with root package name */
        public boolean f1266i = true;

        /* renamed from: j, reason: collision with root package name */
        public int f1268j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f1270k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f1272l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f1274m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f1276n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f1278o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f1280p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f1282q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f1284r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f1285s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f1286t = -1;

        /* renamed from: u, reason: collision with root package name */
        public int f1287u = -1;

        /* renamed from: v, reason: collision with root package name */
        public int f1288v = -1;

        /* renamed from: w, reason: collision with root package name */
        public int f1289w = -1;

        /* renamed from: x, reason: collision with root package name */
        public int f1290x = -1;

        /* renamed from: y, reason: collision with root package name */
        public float f1291y = 0.5f;

        /* renamed from: z, reason: collision with root package name */
        public float f1292z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0, reason: collision with root package name */
        public int f1251a0 = 0;

        /* renamed from: b0, reason: collision with root package name */
        public int f1253b0 = 0;

        /* renamed from: c0, reason: collision with root package name */
        public int f1255c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f1257d0 = 0;

        /* renamed from: e0, reason: collision with root package name */
        public int f1259e0 = 0;

        /* renamed from: f0, reason: collision with root package name */
        public float f1261f0 = 1.0f;

        /* renamed from: g0, reason: collision with root package name */
        public float f1263g0 = 1.0f;

        /* renamed from: h0, reason: collision with root package name */
        public int f1265h0 = -1;

        /* renamed from: i0, reason: collision with root package name */
        public int f1267i0 = 0;

        /* renamed from: j0, reason: collision with root package name */
        public int f1269j0 = -1;

        /* renamed from: n0, reason: collision with root package name */
        public boolean f1277n0 = false;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f1279o0 = false;

        /* renamed from: p0, reason: collision with root package name */
        public boolean f1281p0 = true;

        /* renamed from: q0, reason: collision with root package name */
        public int f1283q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1249r0 = sparseIntArray;
            sparseIntArray.append(h.f1518w5, 24);
            f1249r0.append(h.f1526x5, 25);
            f1249r0.append(h.f1542z5, 28);
            f1249r0.append(h.A5, 29);
            f1249r0.append(h.F5, 35);
            f1249r0.append(h.E5, 34);
            f1249r0.append(h.f1388g5, 4);
            f1249r0.append(h.f1379f5, 3);
            f1249r0.append(h.f1361d5, 1);
            f1249r0.append(h.L5, 6);
            f1249r0.append(h.M5, 7);
            f1249r0.append(h.f1446n5, 17);
            f1249r0.append(h.f1454o5, 18);
            f1249r0.append(h.f1462p5, 19);
            f1249r0.append(h.Z4, 90);
            f1249r0.append(h.L4, 26);
            f1249r0.append(h.B5, 31);
            f1249r0.append(h.C5, 32);
            f1249r0.append(h.f1438m5, 10);
            f1249r0.append(h.f1430l5, 9);
            f1249r0.append(h.P5, 13);
            f1249r0.append(h.S5, 16);
            f1249r0.append(h.Q5, 14);
            f1249r0.append(h.N5, 11);
            f1249r0.append(h.R5, 15);
            f1249r0.append(h.O5, 12);
            f1249r0.append(h.I5, 38);
            f1249r0.append(h.f1502u5, 37);
            f1249r0.append(h.f1494t5, 39);
            f1249r0.append(h.H5, 40);
            f1249r0.append(h.f1486s5, 20);
            f1249r0.append(h.G5, 36);
            f1249r0.append(h.f1422k5, 5);
            f1249r0.append(h.f1510v5, 91);
            f1249r0.append(h.D5, 91);
            f1249r0.append(h.f1534y5, 91);
            f1249r0.append(h.f1370e5, 91);
            f1249r0.append(h.f1352c5, 91);
            f1249r0.append(h.O4, 23);
            f1249r0.append(h.Q4, 27);
            f1249r0.append(h.S4, 30);
            f1249r0.append(h.T4, 8);
            f1249r0.append(h.P4, 33);
            f1249r0.append(h.R4, 2);
            f1249r0.append(h.M4, 22);
            f1249r0.append(h.N4, 21);
            f1249r0.append(h.J5, 41);
            f1249r0.append(h.f1470q5, 42);
            f1249r0.append(h.f1343b5, 41);
            f1249r0.append(h.f1334a5, 42);
            f1249r0.append(h.T5, 76);
            f1249r0.append(h.f1397h5, 61);
            f1249r0.append(h.f1414j5, 62);
            f1249r0.append(h.f1406i5, 63);
            f1249r0.append(h.K5, 69);
            f1249r0.append(h.f1478r5, 70);
            f1249r0.append(h.X4, 71);
            f1249r0.append(h.V4, 72);
            f1249r0.append(h.W4, 73);
            f1249r0.append(h.Y4, 74);
            f1249r0.append(h.U4, 75);
        }

        public void a(b bVar) {
            this.f1250a = bVar.f1250a;
            this.f1256d = bVar.f1256d;
            this.f1252b = bVar.f1252b;
            this.f1258e = bVar.f1258e;
            this.f1260f = bVar.f1260f;
            this.f1262g = bVar.f1262g;
            this.f1264h = bVar.f1264h;
            this.f1266i = bVar.f1266i;
            this.f1268j = bVar.f1268j;
            this.f1270k = bVar.f1270k;
            this.f1272l = bVar.f1272l;
            this.f1274m = bVar.f1274m;
            this.f1276n = bVar.f1276n;
            this.f1278o = bVar.f1278o;
            this.f1280p = bVar.f1280p;
            this.f1282q = bVar.f1282q;
            this.f1284r = bVar.f1284r;
            this.f1285s = bVar.f1285s;
            this.f1286t = bVar.f1286t;
            this.f1287u = bVar.f1287u;
            this.f1288v = bVar.f1288v;
            this.f1289w = bVar.f1289w;
            this.f1290x = bVar.f1290x;
            this.f1291y = bVar.f1291y;
            this.f1292z = bVar.f1292z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f1251a0 = bVar.f1251a0;
            this.f1253b0 = bVar.f1253b0;
            this.f1255c0 = bVar.f1255c0;
            this.f1257d0 = bVar.f1257d0;
            this.f1259e0 = bVar.f1259e0;
            this.f1261f0 = bVar.f1261f0;
            this.f1263g0 = bVar.f1263g0;
            this.f1265h0 = bVar.f1265h0;
            this.f1267i0 = bVar.f1267i0;
            this.f1269j0 = bVar.f1269j0;
            this.f1275m0 = bVar.f1275m0;
            int[] iArr = bVar.f1271k0;
            if (iArr == null || bVar.f1273l0 != null) {
                this.f1271k0 = null;
            } else {
                this.f1271k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f1273l0 = bVar.f1273l0;
            this.f1277n0 = bVar.f1277n0;
            this.f1279o0 = bVar.f1279o0;
            this.f1281p0 = bVar.f1281p0;
            this.f1283q0 = bVar.f1283q0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.K4);
            this.f1252b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                int i8 = f1249r0.get(index);
                switch (i8) {
                    case 1:
                        this.f1284r = e.j(obtainStyledAttributes, index, this.f1284r);
                        break;
                    case 2:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f1282q = e.j(obtainStyledAttributes, index, this.f1282q);
                        break;
                    case 4:
                        this.f1280p = e.j(obtainStyledAttributes, index, this.f1280p);
                        break;
                    case 5:
                        this.A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = obtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.f1290x = e.j(obtainStyledAttributes, index, this.f1290x);
                        break;
                    case 10:
                        this.f1289w = e.j(obtainStyledAttributes, index, this.f1289w);
                        break;
                    case 11:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f1260f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1260f);
                        break;
                    case 18:
                        this.f1262g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1262g);
                        break;
                    case 19:
                        this.f1264h = obtainStyledAttributes.getFloat(index, this.f1264h);
                        break;
                    case 20:
                        this.f1291y = obtainStyledAttributes.getFloat(index, this.f1291y);
                        break;
                    case 21:
                        this.f1258e = obtainStyledAttributes.getLayoutDimension(index, this.f1258e);
                        break;
                    case 22:
                        this.f1256d = obtainStyledAttributes.getLayoutDimension(index, this.f1256d);
                        break;
                    case 23:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f1268j = e.j(obtainStyledAttributes, index, this.f1268j);
                        break;
                    case 25:
                        this.f1270k = e.j(obtainStyledAttributes, index, this.f1270k);
                        break;
                    case 26:
                        this.G = obtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f1272l = e.j(obtainStyledAttributes, index, this.f1272l);
                        break;
                    case 29:
                        this.f1274m = e.j(obtainStyledAttributes, index, this.f1274m);
                        break;
                    case 30:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.f1287u = e.j(obtainStyledAttributes, index, this.f1287u);
                        break;
                    case 32:
                        this.f1288v = e.j(obtainStyledAttributes, index, this.f1288v);
                        break;
                    case 33:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f1278o = e.j(obtainStyledAttributes, index, this.f1278o);
                        break;
                    case 35:
                        this.f1276n = e.j(obtainStyledAttributes, index, this.f1276n);
                        break;
                    case h.f1530y1 /* 36 */:
                        this.f1292z = obtainStyledAttributes.getFloat(index, this.f1292z);
                        break;
                    case 37:
                        this.W = obtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case h.f1478r5 /* 38 */:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case h.f1486s5 /* 39 */:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case h.f1494t5 /* 40 */:
                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case h.f1502u5 /* 41 */:
                        e.k(this, obtainStyledAttributes, index, 0);
                        break;
                    case h.f1510v5 /* 42 */:
                        e.k(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i8) {
                            case 61:
                                this.B = e.j(obtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i8) {
                                    case 69:
                                        this.f1261f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f1263g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f1265h0 = obtainStyledAttributes.getInt(index, this.f1265h0);
                                        break;
                                    case 73:
                                        this.f1267i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1267i0);
                                        break;
                                    case 74:
                                        this.f1273l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f1281p0 = obtainStyledAttributes.getBoolean(index, this.f1281p0);
                                        break;
                                    case 76:
                                        this.f1283q0 = obtainStyledAttributes.getInt(index, this.f1283q0);
                                        break;
                                    case 77:
                                        this.f1285s = e.j(obtainStyledAttributes, index, this.f1285s);
                                        break;
                                    case 78:
                                        this.f1286t = e.j(obtainStyledAttributes, index, this.f1286t);
                                        break;
                                    case 79:
                                        this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case 80:
                                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case 81:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 82:
                                        this.f1251a0 = obtainStyledAttributes.getInt(index, this.f1251a0);
                                        break;
                                    case 83:
                                        this.f1255c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1255c0);
                                        break;
                                    case 84:
                                        this.f1253b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1253b0);
                                        break;
                                    case 85:
                                        this.f1259e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1259e0);
                                        break;
                                    case 86:
                                        this.f1257d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1257d0);
                                        break;
                                    case 87:
                                        this.f1277n0 = obtainStyledAttributes.getBoolean(index, this.f1277n0);
                                        break;
                                    case 88:
                                        this.f1279o0 = obtainStyledAttributes.getBoolean(index, this.f1279o0);
                                        break;
                                    case 89:
                                        this.f1275m0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f1266i = obtainStyledAttributes.getBoolean(index, this.f1266i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1249r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1249r0.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: MyApplication */
    public static class c {

        /* renamed from: o, reason: collision with root package name */
        private static SparseIntArray f1293o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f1294a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f1295b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f1296c = 0;

        /* renamed from: d, reason: collision with root package name */
        public String f1297d = null;

        /* renamed from: e, reason: collision with root package name */
        public int f1298e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f1299f = 0;

        /* renamed from: g, reason: collision with root package name */
        public float f1300g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public int f1301h = -1;

        /* renamed from: i, reason: collision with root package name */
        public float f1302i = Float.NaN;

        /* renamed from: j, reason: collision with root package name */
        public float f1303j = Float.NaN;

        /* renamed from: k, reason: collision with root package name */
        public int f1304k = -1;

        /* renamed from: l, reason: collision with root package name */
        public String f1305l = null;

        /* renamed from: m, reason: collision with root package name */
        public int f1306m = -3;

        /* renamed from: n, reason: collision with root package name */
        public int f1307n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1293o = sparseIntArray;
            sparseIntArray.append(h.f1380f6, 1);
            f1293o.append(h.f1398h6, 2);
            f1293o.append(h.f1431l6, 3);
            f1293o.append(h.f1371e6, 4);
            f1293o.append(h.f1362d6, 5);
            f1293o.append(h.f1353c6, 6);
            f1293o.append(h.f1389g6, 7);
            f1293o.append(h.f1423k6, 8);
            f1293o.append(h.f1415j6, 9);
            f1293o.append(h.f1407i6, 10);
        }

        public void a(c cVar) {
            this.f1294a = cVar.f1294a;
            this.f1295b = cVar.f1295b;
            this.f1297d = cVar.f1297d;
            this.f1298e = cVar.f1298e;
            this.f1299f = cVar.f1299f;
            this.f1302i = cVar.f1302i;
            this.f1300g = cVar.f1300g;
            this.f1301h = cVar.f1301h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f1344b6);
            this.f1294a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                switch (f1293o.get(index)) {
                    case 1:
                        this.f1302i = obtainStyledAttributes.getFloat(index, this.f1302i);
                        break;
                    case 2:
                        this.f1298e = obtainStyledAttributes.getInt(index, this.f1298e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f1297d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f1297d = t.a.f26285c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f1299f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1295b = e.j(obtainStyledAttributes, index, this.f1295b);
                        break;
                    case 6:
                        this.f1296c = obtainStyledAttributes.getInteger(index, this.f1296c);
                        break;
                    case 7:
                        this.f1300g = obtainStyledAttributes.getFloat(index, this.f1300g);
                        break;
                    case 8:
                        this.f1304k = obtainStyledAttributes.getInteger(index, this.f1304k);
                        break;
                    case 9:
                        this.f1303j = obtainStyledAttributes.getFloat(index, this.f1303j);
                        break;
                    case 10:
                        int i8 = obtainStyledAttributes.peekValue(index).type;
                        if (i8 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f1307n = resourceId;
                            if (resourceId != -1) {
                                this.f1306m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i8 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f1305l = string;
                            if (string.indexOf("/") > 0) {
                                this.f1307n = obtainStyledAttributes.getResourceId(index, -1);
                                this.f1306m = -2;
                                break;
                            } else {
                                this.f1306m = -1;
                                break;
                            }
                        } else {
                            this.f1306m = obtainStyledAttributes.getInteger(index, this.f1307n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: MyApplication */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1308a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f1309b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f1310c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f1311d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f1312e = Float.NaN;

        public void a(d dVar) {
            this.f1308a = dVar.f1308a;
            this.f1309b = dVar.f1309b;
            this.f1311d = dVar.f1311d;
            this.f1312e = dVar.f1312e;
            this.f1310c = dVar.f1310c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f1519w6);
            this.f1308a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == h.f1535y6) {
                    this.f1311d = obtainStyledAttributes.getFloat(index, this.f1311d);
                } else if (index == h.f1527x6) {
                    this.f1309b = obtainStyledAttributes.getInt(index, this.f1309b);
                    this.f1309b = e.f1221f[this.f1309b];
                } else if (index == h.A6) {
                    this.f1310c = obtainStyledAttributes.getInt(index, this.f1310c);
                } else if (index == h.f1543z6) {
                    this.f1312e = obtainStyledAttributes.getFloat(index, this.f1312e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.constraintlayout.widget.e$e, reason: collision with other inner class name */
    public static class C0019e {

        /* renamed from: o, reason: collision with root package name */
        private static SparseIntArray f1313o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f1314a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f1315b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f1316c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f1317d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f1318e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f1319f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f1320g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f1321h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public int f1322i = -1;

        /* renamed from: j, reason: collision with root package name */
        public float f1323j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f1324k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public float f1325l = 0.0f;

        /* renamed from: m, reason: collision with root package name */
        public boolean f1326m = false;

        /* renamed from: n, reason: collision with root package name */
        public float f1327n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1313o = sparseIntArray;
            sparseIntArray.append(h.V6, 1);
            f1313o.append(h.W6, 2);
            f1313o.append(h.X6, 3);
            f1313o.append(h.T6, 4);
            f1313o.append(h.U6, 5);
            f1313o.append(h.P6, 6);
            f1313o.append(h.Q6, 7);
            f1313o.append(h.R6, 8);
            f1313o.append(h.S6, 9);
            f1313o.append(h.Y6, 10);
            f1313o.append(h.Z6, 11);
            f1313o.append(h.f1336a7, 12);
        }

        public void a(C0019e c0019e) {
            this.f1314a = c0019e.f1314a;
            this.f1315b = c0019e.f1315b;
            this.f1316c = c0019e.f1316c;
            this.f1317d = c0019e.f1317d;
            this.f1318e = c0019e.f1318e;
            this.f1319f = c0019e.f1319f;
            this.f1320g = c0019e.f1320g;
            this.f1321h = c0019e.f1321h;
            this.f1322i = c0019e.f1322i;
            this.f1323j = c0019e.f1323j;
            this.f1324k = c0019e.f1324k;
            this.f1325l = c0019e.f1325l;
            this.f1326m = c0019e.f1326m;
            this.f1327n = c0019e.f1327n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.O6);
            this.f1314a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                switch (f1313o.get(index)) {
                    case 1:
                        this.f1315b = obtainStyledAttributes.getFloat(index, this.f1315b);
                        break;
                    case 2:
                        this.f1316c = obtainStyledAttributes.getFloat(index, this.f1316c);
                        break;
                    case 3:
                        this.f1317d = obtainStyledAttributes.getFloat(index, this.f1317d);
                        break;
                    case 4:
                        this.f1318e = obtainStyledAttributes.getFloat(index, this.f1318e);
                        break;
                    case 5:
                        this.f1319f = obtainStyledAttributes.getFloat(index, this.f1319f);
                        break;
                    case 6:
                        this.f1320g = obtainStyledAttributes.getDimension(index, this.f1320g);
                        break;
                    case 7:
                        this.f1321h = obtainStyledAttributes.getDimension(index, this.f1321h);
                        break;
                    case 8:
                        this.f1323j = obtainStyledAttributes.getDimension(index, this.f1323j);
                        break;
                    case 9:
                        this.f1324k = obtainStyledAttributes.getDimension(index, this.f1324k);
                        break;
                    case 10:
                        this.f1325l = obtainStyledAttributes.getDimension(index, this.f1325l);
                        break;
                    case 11:
                        this.f1326m = true;
                        this.f1327n = obtainStyledAttributes.getDimension(index, this.f1327n);
                        break;
                    case 12:
                        this.f1322i = e.j(obtainStyledAttributes, index, this.f1322i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f1222g.append(h.A0, 25);
        f1222g.append(h.B0, 26);
        f1222g.append(h.D0, 29);
        f1222g.append(h.E0, 30);
        f1222g.append(h.K0, 36);
        f1222g.append(h.J0, 35);
        f1222g.append(h.f1392h0, 4);
        f1222g.append(h.f1383g0, 3);
        f1222g.append(h.f1347c0, 1);
        f1222g.append(h.f1365e0, 91);
        f1222g.append(h.f1356d0, 92);
        f1222g.append(h.T0, 6);
        f1222g.append(h.U0, 7);
        f1222g.append(h.f1449o0, 17);
        f1222g.append(h.f1457p0, 18);
        f1222g.append(h.f1465q0, 19);
        f1222g.append(h.Y, 99);
        f1222g.append(h.f1496u, 27);
        f1222g.append(h.F0, 32);
        f1222g.append(h.G0, 33);
        f1222g.append(h.f1441n0, 10);
        f1222g.append(h.f1433m0, 9);
        f1222g.append(h.X0, 13);
        f1222g.append(h.f1330a1, 16);
        f1222g.append(h.Y0, 14);
        f1222g.append(h.V0, 11);
        f1222g.append(h.Z0, 15);
        f1222g.append(h.W0, 12);
        f1222g.append(h.N0, 40);
        f1222g.append(h.f1529y0, 39);
        f1222g.append(h.f1521x0, 41);
        f1222g.append(h.M0, 42);
        f1222g.append(h.f1513w0, 20);
        f1222g.append(h.L0, 37);
        f1222g.append(h.f1425l0, 5);
        f1222g.append(h.f1537z0, 87);
        f1222g.append(h.I0, 87);
        f1222g.append(h.C0, 87);
        f1222g.append(h.f1374f0, 87);
        f1222g.append(h.f1338b0, 87);
        f1222g.append(h.f1536z, 24);
        f1222g.append(h.B, 28);
        f1222g.append(h.N, 31);
        f1222g.append(h.O, 8);
        f1222g.append(h.A, 34);
        f1222g.append(h.C, 2);
        f1222g.append(h.f1520x, 23);
        f1222g.append(h.f1528y, 21);
        f1222g.append(h.O0, 95);
        f1222g.append(h.f1473r0, 96);
        f1222g.append(h.f1512w, 22);
        f1222g.append(h.D, 43);
        f1222g.append(h.Q, 44);
        f1222g.append(h.L, 45);
        f1222g.append(h.M, 46);
        f1222g.append(h.K, 60);
        f1222g.append(h.I, 47);
        f1222g.append(h.J, 48);
        f1222g.append(h.E, 49);
        f1222g.append(h.F, 50);
        f1222g.append(h.G, 51);
        f1222g.append(h.H, 52);
        f1222g.append(h.P, 53);
        f1222g.append(h.P0, 54);
        f1222g.append(h.f1481s0, 55);
        f1222g.append(h.Q0, 56);
        f1222g.append(h.f1489t0, 57);
        f1222g.append(h.R0, 58);
        f1222g.append(h.f1497u0, 59);
        f1222g.append(h.f1401i0, 61);
        f1222g.append(h.f1417k0, 62);
        f1222g.append(h.f1409j0, 63);
        f1222g.append(h.R, 64);
        f1222g.append(h.f1418k1, 65);
        f1222g.append(h.X, 66);
        f1222g.append(h.f1426l1, 67);
        f1222g.append(h.f1357d1, 79);
        f1222g.append(h.f1504v, 38);
        f1222g.append(h.f1348c1, 68);
        f1222g.append(h.S0, 69);
        f1222g.append(h.f1505v0, 70);
        f1222g.append(h.f1339b1, 97);
        f1222g.append(h.V, 71);
        f1222g.append(h.T, 72);
        f1222g.append(h.U, 73);
        f1222g.append(h.W, 74);
        f1222g.append(h.S, 75);
        f1222g.append(h.f1366e1, 76);
        f1222g.append(h.H0, 77);
        f1222g.append(h.f1434m1, 78);
        f1222g.append(h.f1329a0, 80);
        f1222g.append(h.Z, 81);
        f1222g.append(h.f1375f1, 82);
        f1222g.append(h.f1410j1, 83);
        f1222g.append(h.f1402i1, 84);
        f1222g.append(h.f1393h1, 85);
        f1222g.append(h.f1384g1, 86);
        SparseIntArray sparseIntArray = f1223h;
        int i7 = h.P3;
        sparseIntArray.append(i7, 6);
        f1223h.append(i7, 7);
        f1223h.append(h.K2, 27);
        f1223h.append(h.S3, 13);
        f1223h.append(h.V3, 16);
        f1223h.append(h.T3, 14);
        f1223h.append(h.Q3, 11);
        f1223h.append(h.U3, 15);
        f1223h.append(h.R3, 12);
        f1223h.append(h.J3, 40);
        f1223h.append(h.C3, 39);
        f1223h.append(h.B3, 41);
        f1223h.append(h.I3, 42);
        f1223h.append(h.A3, 20);
        f1223h.append(h.H3, 37);
        f1223h.append(h.f1500u3, 5);
        f1223h.append(h.D3, 87);
        f1223h.append(h.G3, 87);
        f1223h.append(h.E3, 87);
        f1223h.append(h.f1476r3, 87);
        f1223h.append(h.f1468q3, 87);
        f1223h.append(h.P2, 24);
        f1223h.append(h.R2, 28);
        f1223h.append(h.f1359d3, 31);
        f1223h.append(h.f1368e3, 8);
        f1223h.append(h.Q2, 34);
        f1223h.append(h.S2, 2);
        f1223h.append(h.N2, 23);
        f1223h.append(h.O2, 21);
        f1223h.append(h.K3, 95);
        f1223h.append(h.f1508v3, 96);
        f1223h.append(h.M2, 22);
        f1223h.append(h.T2, 43);
        f1223h.append(h.f1386g3, 44);
        f1223h.append(h.f1341b3, 45);
        f1223h.append(h.f1350c3, 46);
        f1223h.append(h.f1332a3, 60);
        f1223h.append(h.Y2, 47);
        f1223h.append(h.Z2, 48);
        f1223h.append(h.U2, 49);
        f1223h.append(h.V2, 50);
        f1223h.append(h.W2, 51);
        f1223h.append(h.X2, 52);
        f1223h.append(h.f1377f3, 53);
        f1223h.append(h.L3, 54);
        f1223h.append(h.f1516w3, 55);
        f1223h.append(h.M3, 56);
        f1223h.append(h.f1524x3, 57);
        f1223h.append(h.N3, 58);
        f1223h.append(h.f1532y3, 59);
        f1223h.append(h.f1492t3, 62);
        f1223h.append(h.f1484s3, 63);
        f1223h.append(h.f1395h3, 64);
        f1223h.append(h.f1387g4, 65);
        f1223h.append(h.f1444n3, 66);
        f1223h.append(h.f1396h4, 67);
        f1223h.append(h.Y3, 79);
        f1223h.append(h.L2, 38);
        f1223h.append(h.Z3, 98);
        f1223h.append(h.X3, 68);
        f1223h.append(h.O3, 69);
        f1223h.append(h.f1540z3, 70);
        f1223h.append(h.f1428l3, 71);
        f1223h.append(h.f1412j3, 72);
        f1223h.append(h.f1420k3, 73);
        f1223h.append(h.f1436m3, 74);
        f1223h.append(h.f1404i3, 75);
        f1223h.append(h.f1333a4, 76);
        f1223h.append(h.F3, 77);
        f1223h.append(h.f1405i4, 78);
        f1223h.append(h.f1460p3, 80);
        f1223h.append(h.f1452o3, 81);
        f1223h.append(h.f1342b4, 82);
        f1223h.append(h.f1378f4, 83);
        f1223h.append(h.f1369e4, 84);
        f1223h.append(h.f1360d4, 85);
        f1223h.append(h.f1351c4, 86);
        f1223h.append(h.W3, 97);
    }

    private int[] f(View view, String str) {
        int i7;
        Object f8;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i8 = 0;
        int i9 = 0;
        while (i8 < split.length) {
            String trim = split[i8].trim();
            try {
                i7 = g.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i7 = 0;
            }
            if (i7 == 0) {
                i7 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i7 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (f8 = ((ConstraintLayout) view.getParent()).f(0, trim)) != null && (f8 instanceof Integer)) {
                i7 = ((Integer) f8).intValue();
            }
            iArr[i9] = i7;
            i8++;
            i9++;
        }
        return i9 != split.length ? Arrays.copyOf(iArr, i9) : iArr;
    }

    private a g(Context context, AttributeSet attributeSet, boolean z7) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z7 ? h.J2 : h.f1488t);
        n(context, aVar, obtainStyledAttributes, z7);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(TypedArray typedArray, int i7, int i8) {
        int resourceId = typedArray.getResourceId(i7, i8);
        return resourceId == -1 ? typedArray.getInt(i7, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void k(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L4
            goto L71
        L4:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L72
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L2b
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L27
            r6 = -3
            if (r5 == r6) goto L21
            if (r5 == r0) goto L23
            r6 = -1
            if (r5 == r6) goto L23
        L21:
            r5 = r2
            goto L30
        L23:
            r3 = r2
            r2 = r5
            r5 = r3
            goto L30
        L27:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L30
        L2b:
            int r5 = r5.getDimensionPixelSize(r6, r2)
            goto L23
        L30:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r6 == 0) goto L42
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.b) r4
            if (r7 != 0) goto L3d
            r4.width = r2
            r4.f1120a0 = r5
            return
        L3d:
            r4.height = r2
            r4.f1122b0 = r5
            return
        L42:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.e.b
            if (r6 == 0) goto L54
            androidx.constraintlayout.widget.e$b r4 = (androidx.constraintlayout.widget.e.b) r4
            if (r7 != 0) goto L4f
            r4.f1256d = r2
            r4.f1277n0 = r5
            return
        L4f:
            r4.f1258e = r2
            r4.f1279o0 = r5
            return
        L54:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.e.a.C0018a
            if (r6 == 0) goto L71
            androidx.constraintlayout.widget.e$a$a r4 = (androidx.constraintlayout.widget.e.a.C0018a) r4
            if (r7 != 0) goto L67
            r6 = 23
            r4.b(r6, r2)
            r6 = 80
            r4.d(r6, r5)
            return
        L67:
            r6 = 21
            r4.b(r6, r2)
            r6 = 81
            r4.d(r6, r5)
        L71:
            return
        L72:
            java.lang.String r5 = r5.getString(r6)
            l(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.k(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void l(Object obj, String str, int i7) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if ("ratio".equalsIgnoreCase(trim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i7 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    m(bVar, trim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).A = trim2;
                    return;
                } else {
                    if (obj instanceof a.C0018a) {
                        ((a.C0018a) obj).c(5, trim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i7 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.L = parseFloat;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.M = parseFloat;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i7 == 0) {
                            bVar3.f1256d = 0;
                            bVar3.W = parseFloat;
                            return;
                        } else {
                            bVar3.f1258e = 0;
                            bVar3.V = parseFloat;
                            return;
                        }
                    }
                    if (obj instanceof a.C0018a) {
                        a.C0018a c0018a = (a.C0018a) obj;
                        if (i7 == 0) {
                            c0018a.b(23, 0);
                            c0018a.a(39, parseFloat);
                            return;
                        } else {
                            c0018a.b(21, 0);
                            c0018a.a(40, parseFloat);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(trim)) {
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i7 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.V = max;
                            bVar4.P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.W = max;
                            bVar4.Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i7 == 0) {
                            bVar5.f1256d = 0;
                            bVar5.f1261f0 = max;
                            bVar5.Z = 2;
                            return;
                        } else {
                            bVar5.f1258e = 0;
                            bVar5.f1263g0 = max;
                            bVar5.f1251a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0018a) {
                        a.C0018a c0018a2 = (a.C0018a) obj;
                        if (i7 == 0) {
                            c0018a2.b(23, 0);
                            c0018a2.b(54, 2);
                        } else {
                            c0018a2.b(21, 0);
                            c0018a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void m(ConstraintLayout.b bVar, String str) {
        float f8 = Float.NaN;
        int i7 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i8 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i7 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i7 = 1;
                }
                i8 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i8);
                    if (substring2.length() > 0) {
                        f8 = Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i8, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f8 = i7 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = f8;
        bVar.K = i7;
    }

    private void n(Context context, a aVar, TypedArray typedArray, boolean z7) {
        if (z7) {
            o(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArray.getIndex(i7);
            if (index != h.f1504v && h.N != index && h.O != index) {
                aVar.f1232d.f1294a = true;
                aVar.f1233e.f1252b = true;
                aVar.f1231c.f1308a = true;
                aVar.f1234f.f1314a = true;
            }
            switch (f1222g.get(index)) {
                case 1:
                    b bVar = aVar.f1233e;
                    bVar.f1284r = j(typedArray, index, bVar.f1284r);
                    break;
                case 2:
                    b bVar2 = aVar.f1233e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.f1233e;
                    bVar3.f1282q = j(typedArray, index, bVar3.f1282q);
                    break;
                case 4:
                    b bVar4 = aVar.f1233e;
                    bVar4.f1280p = j(typedArray, index, bVar4.f1280p);
                    break;
                case 5:
                    aVar.f1233e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f1233e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.f1233e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = aVar.f1233e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = aVar.f1233e;
                    bVar8.f1290x = j(typedArray, index, bVar8.f1290x);
                    break;
                case 10:
                    b bVar9 = aVar.f1233e;
                    bVar9.f1289w = j(typedArray, index, bVar9.f1289w);
                    break;
                case 11:
                    b bVar10 = aVar.f1233e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.f1233e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.f1233e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.f1233e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.f1233e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.f1233e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.f1233e;
                    bVar16.f1260f = typedArray.getDimensionPixelOffset(index, bVar16.f1260f);
                    break;
                case 18:
                    b bVar17 = aVar.f1233e;
                    bVar17.f1262g = typedArray.getDimensionPixelOffset(index, bVar17.f1262g);
                    break;
                case 19:
                    b bVar18 = aVar.f1233e;
                    bVar18.f1264h = typedArray.getFloat(index, bVar18.f1264h);
                    break;
                case 20:
                    b bVar19 = aVar.f1233e;
                    bVar19.f1291y = typedArray.getFloat(index, bVar19.f1291y);
                    break;
                case 21:
                    b bVar20 = aVar.f1233e;
                    bVar20.f1258e = typedArray.getLayoutDimension(index, bVar20.f1258e);
                    break;
                case 22:
                    d dVar = aVar.f1231c;
                    dVar.f1309b = typedArray.getInt(index, dVar.f1309b);
                    d dVar2 = aVar.f1231c;
                    dVar2.f1309b = f1221f[dVar2.f1309b];
                    break;
                case 23:
                    b bVar21 = aVar.f1233e;
                    bVar21.f1256d = typedArray.getLayoutDimension(index, bVar21.f1256d);
                    break;
                case 24:
                    b bVar22 = aVar.f1233e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = aVar.f1233e;
                    bVar23.f1268j = j(typedArray, index, bVar23.f1268j);
                    break;
                case 26:
                    b bVar24 = aVar.f1233e;
                    bVar24.f1270k = j(typedArray, index, bVar24.f1270k);
                    break;
                case 27:
                    b bVar25 = aVar.f1233e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.f1233e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = aVar.f1233e;
                    bVar27.f1272l = j(typedArray, index, bVar27.f1272l);
                    break;
                case 30:
                    b bVar28 = aVar.f1233e;
                    bVar28.f1274m = j(typedArray, index, bVar28.f1274m);
                    break;
                case 31:
                    b bVar29 = aVar.f1233e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = aVar.f1233e;
                    bVar30.f1287u = j(typedArray, index, bVar30.f1287u);
                    break;
                case 33:
                    b bVar31 = aVar.f1233e;
                    bVar31.f1288v = j(typedArray, index, bVar31.f1288v);
                    break;
                case 34:
                    b bVar32 = aVar.f1233e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = aVar.f1233e;
                    bVar33.f1278o = j(typedArray, index, bVar33.f1278o);
                    break;
                case h.f1530y1 /* 36 */:
                    b bVar34 = aVar.f1233e;
                    bVar34.f1276n = j(typedArray, index, bVar34.f1276n);
                    break;
                case 37:
                    b bVar35 = aVar.f1233e;
                    bVar35.f1292z = typedArray.getFloat(index, bVar35.f1292z);
                    break;
                case h.f1478r5 /* 38 */:
                    aVar.f1229a = typedArray.getResourceId(index, aVar.f1229a);
                    break;
                case h.f1486s5 /* 39 */:
                    b bVar36 = aVar.f1233e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case h.f1494t5 /* 40 */:
                    b bVar37 = aVar.f1233e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case h.f1502u5 /* 41 */:
                    b bVar38 = aVar.f1233e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case h.f1510v5 /* 42 */:
                    b bVar39 = aVar.f1233e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case h.f1518w5 /* 43 */:
                    d dVar3 = aVar.f1231c;
                    dVar3.f1311d = typedArray.getFloat(index, dVar3.f1311d);
                    break;
                case h.f1526x5 /* 44 */:
                    C0019e c0019e = aVar.f1234f;
                    c0019e.f1326m = true;
                    c0019e.f1327n = typedArray.getDimension(index, c0019e.f1327n);
                    break;
                case h.f1534y5 /* 45 */:
                    C0019e c0019e2 = aVar.f1234f;
                    c0019e2.f1316c = typedArray.getFloat(index, c0019e2.f1316c);
                    break;
                case h.f1542z5 /* 46 */:
                    C0019e c0019e3 = aVar.f1234f;
                    c0019e3.f1317d = typedArray.getFloat(index, c0019e3.f1317d);
                    break;
                case h.A5 /* 47 */:
                    C0019e c0019e4 = aVar.f1234f;
                    c0019e4.f1318e = typedArray.getFloat(index, c0019e4.f1318e);
                    break;
                case h.B5 /* 48 */:
                    C0019e c0019e5 = aVar.f1234f;
                    c0019e5.f1319f = typedArray.getFloat(index, c0019e5.f1319f);
                    break;
                case h.C5 /* 49 */:
                    C0019e c0019e6 = aVar.f1234f;
                    c0019e6.f1320g = typedArray.getDimension(index, c0019e6.f1320g);
                    break;
                case h.D5 /* 50 */:
                    C0019e c0019e7 = aVar.f1234f;
                    c0019e7.f1321h = typedArray.getDimension(index, c0019e7.f1321h);
                    break;
                case h.E5 /* 51 */:
                    C0019e c0019e8 = aVar.f1234f;
                    c0019e8.f1323j = typedArray.getDimension(index, c0019e8.f1323j);
                    break;
                case h.F5 /* 52 */:
                    C0019e c0019e9 = aVar.f1234f;
                    c0019e9.f1324k = typedArray.getDimension(index, c0019e9.f1324k);
                    break;
                case h.G5 /* 53 */:
                    C0019e c0019e10 = aVar.f1234f;
                    c0019e10.f1325l = typedArray.getDimension(index, c0019e10.f1325l);
                    break;
                case 54:
                    b bVar40 = aVar.f1233e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.f1233e;
                    bVar41.f1251a0 = typedArray.getInt(index, bVar41.f1251a0);
                    break;
                case 56:
                    b bVar42 = aVar.f1233e;
                    bVar42.f1253b0 = typedArray.getDimensionPixelSize(index, bVar42.f1253b0);
                    break;
                case 57:
                    b bVar43 = aVar.f1233e;
                    bVar43.f1255c0 = typedArray.getDimensionPixelSize(index, bVar43.f1255c0);
                    break;
                case 58:
                    b bVar44 = aVar.f1233e;
                    bVar44.f1257d0 = typedArray.getDimensionPixelSize(index, bVar44.f1257d0);
                    break;
                case 59:
                    b bVar45 = aVar.f1233e;
                    bVar45.f1259e0 = typedArray.getDimensionPixelSize(index, bVar45.f1259e0);
                    break;
                case 60:
                    C0019e c0019e11 = aVar.f1234f;
                    c0019e11.f1315b = typedArray.getFloat(index, c0019e11.f1315b);
                    break;
                case 61:
                    b bVar46 = aVar.f1233e;
                    bVar46.B = j(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = aVar.f1233e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = aVar.f1233e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    c cVar = aVar.f1232d;
                    cVar.f1295b = j(typedArray, index, cVar.f1295b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f1232d.f1297d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f1232d.f1297d = t.a.f26285c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f1232d.f1299f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f1232d;
                    cVar2.f1302i = typedArray.getFloat(index, cVar2.f1302i);
                    break;
                case 68:
                    d dVar4 = aVar.f1231c;
                    dVar4.f1312e = typedArray.getFloat(index, dVar4.f1312e);
                    break;
                case 69:
                    aVar.f1233e.f1261f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f1233e.f1263g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f1233e;
                    bVar49.f1265h0 = typedArray.getInt(index, bVar49.f1265h0);
                    break;
                case 73:
                    b bVar50 = aVar.f1233e;
                    bVar50.f1267i0 = typedArray.getDimensionPixelSize(index, bVar50.f1267i0);
                    break;
                case 74:
                    aVar.f1233e.f1273l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f1233e;
                    bVar51.f1281p0 = typedArray.getBoolean(index, bVar51.f1281p0);
                    break;
                case 76:
                    c cVar3 = aVar.f1232d;
                    cVar3.f1298e = typedArray.getInt(index, cVar3.f1298e);
                    break;
                case 77:
                    aVar.f1233e.f1275m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f1231c;
                    dVar5.f1310c = typedArray.getInt(index, dVar5.f1310c);
                    break;
                case 79:
                    c cVar4 = aVar.f1232d;
                    cVar4.f1300g = typedArray.getFloat(index, cVar4.f1300g);
                    break;
                case 80:
                    b bVar52 = aVar.f1233e;
                    bVar52.f1277n0 = typedArray.getBoolean(index, bVar52.f1277n0);
                    break;
                case 81:
                    b bVar53 = aVar.f1233e;
                    bVar53.f1279o0 = typedArray.getBoolean(index, bVar53.f1279o0);
                    break;
                case 82:
                    c cVar5 = aVar.f1232d;
                    cVar5.f1296c = typedArray.getInteger(index, cVar5.f1296c);
                    break;
                case 83:
                    C0019e c0019e12 = aVar.f1234f;
                    c0019e12.f1322i = j(typedArray, index, c0019e12.f1322i);
                    break;
                case 84:
                    c cVar6 = aVar.f1232d;
                    cVar6.f1304k = typedArray.getInteger(index, cVar6.f1304k);
                    break;
                case 85:
                    c cVar7 = aVar.f1232d;
                    cVar7.f1303j = typedArray.getFloat(index, cVar7.f1303j);
                    break;
                case 86:
                    int i8 = typedArray.peekValue(index).type;
                    if (i8 == 1) {
                        aVar.f1232d.f1307n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f1232d;
                        if (cVar8.f1307n != -1) {
                            cVar8.f1306m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i8 == 3) {
                        aVar.f1232d.f1305l = typedArray.getString(index);
                        if (aVar.f1232d.f1305l.indexOf("/") > 0) {
                            aVar.f1232d.f1307n = typedArray.getResourceId(index, -1);
                            aVar.f1232d.f1306m = -2;
                            break;
                        } else {
                            aVar.f1232d.f1306m = -1;
                            break;
                        }
                    } else {
                        c cVar9 = aVar.f1232d;
                        cVar9.f1306m = typedArray.getInteger(index, cVar9.f1307n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1222g.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1222g.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f1233e;
                    bVar54.f1285s = j(typedArray, index, bVar54.f1285s);
                    break;
                case 92:
                    b bVar55 = aVar.f1233e;
                    bVar55.f1286t = j(typedArray, index, bVar55.f1286t);
                    break;
                case 93:
                    b bVar56 = aVar.f1233e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = aVar.f1233e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    k(aVar.f1233e, typedArray, index, 0);
                    break;
                case 96:
                    k(aVar.f1233e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f1233e;
                    bVar58.f1283q0 = typedArray.getInt(index, bVar58.f1283q0);
                    break;
            }
        }
        b bVar59 = aVar.f1233e;
        if (bVar59.f1273l0 != null) {
            bVar59.f1271k0 = null;
        }
    }

    private static void o(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0018a c0018a = new a.C0018a();
        aVar.f1236h = c0018a;
        aVar.f1232d.f1294a = false;
        aVar.f1233e.f1252b = false;
        aVar.f1231c.f1308a = false;
        aVar.f1234f.f1314a = false;
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArray.getIndex(i7);
            switch (f1223h.get(index)) {
                case 2:
                    c0018a.b(2, typedArray.getDimensionPixelSize(index, aVar.f1233e.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case h.f1530y1 /* 36 */:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1222g.get(index));
                    break;
                case 5:
                    c0018a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0018a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f1233e.E));
                    break;
                case 7:
                    c0018a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f1233e.F));
                    break;
                case 8:
                    c0018a.b(8, typedArray.getDimensionPixelSize(index, aVar.f1233e.L));
                    break;
                case 11:
                    c0018a.b(11, typedArray.getDimensionPixelSize(index, aVar.f1233e.R));
                    break;
                case 12:
                    c0018a.b(12, typedArray.getDimensionPixelSize(index, aVar.f1233e.S));
                    break;
                case 13:
                    c0018a.b(13, typedArray.getDimensionPixelSize(index, aVar.f1233e.O));
                    break;
                case 14:
                    c0018a.b(14, typedArray.getDimensionPixelSize(index, aVar.f1233e.Q));
                    break;
                case 15:
                    c0018a.b(15, typedArray.getDimensionPixelSize(index, aVar.f1233e.T));
                    break;
                case 16:
                    c0018a.b(16, typedArray.getDimensionPixelSize(index, aVar.f1233e.P));
                    break;
                case 17:
                    c0018a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f1233e.f1260f));
                    break;
                case 18:
                    c0018a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f1233e.f1262g));
                    break;
                case 19:
                    c0018a.a(19, typedArray.getFloat(index, aVar.f1233e.f1264h));
                    break;
                case 20:
                    c0018a.a(20, typedArray.getFloat(index, aVar.f1233e.f1291y));
                    break;
                case 21:
                    c0018a.b(21, typedArray.getLayoutDimension(index, aVar.f1233e.f1258e));
                    break;
                case 22:
                    c0018a.b(22, f1221f[typedArray.getInt(index, aVar.f1231c.f1309b)]);
                    break;
                case 23:
                    c0018a.b(23, typedArray.getLayoutDimension(index, aVar.f1233e.f1256d));
                    break;
                case 24:
                    c0018a.b(24, typedArray.getDimensionPixelSize(index, aVar.f1233e.H));
                    break;
                case 27:
                    c0018a.b(27, typedArray.getInt(index, aVar.f1233e.G));
                    break;
                case 28:
                    c0018a.b(28, typedArray.getDimensionPixelSize(index, aVar.f1233e.I));
                    break;
                case 31:
                    c0018a.b(31, typedArray.getDimensionPixelSize(index, aVar.f1233e.M));
                    break;
                case 34:
                    c0018a.b(34, typedArray.getDimensionPixelSize(index, aVar.f1233e.J));
                    break;
                case 37:
                    c0018a.a(37, typedArray.getFloat(index, aVar.f1233e.f1292z));
                    break;
                case h.f1478r5 /* 38 */:
                    int resourceId = typedArray.getResourceId(index, aVar.f1229a);
                    aVar.f1229a = resourceId;
                    c0018a.b(38, resourceId);
                    break;
                case h.f1486s5 /* 39 */:
                    c0018a.a(39, typedArray.getFloat(index, aVar.f1233e.W));
                    break;
                case h.f1494t5 /* 40 */:
                    c0018a.a(40, typedArray.getFloat(index, aVar.f1233e.V));
                    break;
                case h.f1502u5 /* 41 */:
                    c0018a.b(41, typedArray.getInt(index, aVar.f1233e.X));
                    break;
                case h.f1510v5 /* 42 */:
                    c0018a.b(42, typedArray.getInt(index, aVar.f1233e.Y));
                    break;
                case h.f1518w5 /* 43 */:
                    c0018a.a(43, typedArray.getFloat(index, aVar.f1231c.f1311d));
                    break;
                case h.f1526x5 /* 44 */:
                    c0018a.d(44, true);
                    c0018a.a(44, typedArray.getDimension(index, aVar.f1234f.f1327n));
                    break;
                case h.f1534y5 /* 45 */:
                    c0018a.a(45, typedArray.getFloat(index, aVar.f1234f.f1316c));
                    break;
                case h.f1542z5 /* 46 */:
                    c0018a.a(46, typedArray.getFloat(index, aVar.f1234f.f1317d));
                    break;
                case h.A5 /* 47 */:
                    c0018a.a(47, typedArray.getFloat(index, aVar.f1234f.f1318e));
                    break;
                case h.B5 /* 48 */:
                    c0018a.a(48, typedArray.getFloat(index, aVar.f1234f.f1319f));
                    break;
                case h.C5 /* 49 */:
                    c0018a.a(49, typedArray.getDimension(index, aVar.f1234f.f1320g));
                    break;
                case h.D5 /* 50 */:
                    c0018a.a(50, typedArray.getDimension(index, aVar.f1234f.f1321h));
                    break;
                case h.E5 /* 51 */:
                    c0018a.a(51, typedArray.getDimension(index, aVar.f1234f.f1323j));
                    break;
                case h.F5 /* 52 */:
                    c0018a.a(52, typedArray.getDimension(index, aVar.f1234f.f1324k));
                    break;
                case h.G5 /* 53 */:
                    c0018a.a(53, typedArray.getDimension(index, aVar.f1234f.f1325l));
                    break;
                case 54:
                    c0018a.b(54, typedArray.getInt(index, aVar.f1233e.Z));
                    break;
                case 55:
                    c0018a.b(55, typedArray.getInt(index, aVar.f1233e.f1251a0));
                    break;
                case 56:
                    c0018a.b(56, typedArray.getDimensionPixelSize(index, aVar.f1233e.f1253b0));
                    break;
                case 57:
                    c0018a.b(57, typedArray.getDimensionPixelSize(index, aVar.f1233e.f1255c0));
                    break;
                case 58:
                    c0018a.b(58, typedArray.getDimensionPixelSize(index, aVar.f1233e.f1257d0));
                    break;
                case 59:
                    c0018a.b(59, typedArray.getDimensionPixelSize(index, aVar.f1233e.f1259e0));
                    break;
                case 60:
                    c0018a.a(60, typedArray.getFloat(index, aVar.f1234f.f1315b));
                    break;
                case 62:
                    c0018a.b(62, typedArray.getDimensionPixelSize(index, aVar.f1233e.C));
                    break;
                case 63:
                    c0018a.a(63, typedArray.getFloat(index, aVar.f1233e.D));
                    break;
                case 64:
                    c0018a.b(64, j(typedArray, index, aVar.f1232d.f1295b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0018a.c(65, typedArray.getString(index));
                        break;
                    } else {
                        c0018a.c(65, t.a.f26285c[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0018a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0018a.a(67, typedArray.getFloat(index, aVar.f1232d.f1302i));
                    break;
                case 68:
                    c0018a.a(68, typedArray.getFloat(index, aVar.f1231c.f1312e));
                    break;
                case 69:
                    c0018a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0018a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0018a.b(72, typedArray.getInt(index, aVar.f1233e.f1265h0));
                    break;
                case 73:
                    c0018a.b(73, typedArray.getDimensionPixelSize(index, aVar.f1233e.f1267i0));
                    break;
                case 74:
                    c0018a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0018a.d(75, typedArray.getBoolean(index, aVar.f1233e.f1281p0));
                    break;
                case 76:
                    c0018a.b(76, typedArray.getInt(index, aVar.f1232d.f1298e));
                    break;
                case 77:
                    c0018a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0018a.b(78, typedArray.getInt(index, aVar.f1231c.f1310c));
                    break;
                case 79:
                    c0018a.a(79, typedArray.getFloat(index, aVar.f1232d.f1300g));
                    break;
                case 80:
                    c0018a.d(80, typedArray.getBoolean(index, aVar.f1233e.f1277n0));
                    break;
                case 81:
                    c0018a.d(81, typedArray.getBoolean(index, aVar.f1233e.f1279o0));
                    break;
                case 82:
                    c0018a.b(82, typedArray.getInteger(index, aVar.f1232d.f1296c));
                    break;
                case 83:
                    c0018a.b(83, j(typedArray, index, aVar.f1234f.f1322i));
                    break;
                case 84:
                    c0018a.b(84, typedArray.getInteger(index, aVar.f1232d.f1304k));
                    break;
                case 85:
                    c0018a.a(85, typedArray.getFloat(index, aVar.f1232d.f1303j));
                    break;
                case 86:
                    int i8 = typedArray.peekValue(index).type;
                    if (i8 == 1) {
                        aVar.f1232d.f1307n = typedArray.getResourceId(index, -1);
                        c0018a.b(89, aVar.f1232d.f1307n);
                        c cVar = aVar.f1232d;
                        if (cVar.f1307n != -1) {
                            cVar.f1306m = -2;
                            c0018a.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i8 == 3) {
                        aVar.f1232d.f1305l = typedArray.getString(index);
                        c0018a.c(90, aVar.f1232d.f1305l);
                        if (aVar.f1232d.f1305l.indexOf("/") > 0) {
                            aVar.f1232d.f1307n = typedArray.getResourceId(index, -1);
                            c0018a.b(89, aVar.f1232d.f1307n);
                            aVar.f1232d.f1306m = -2;
                            c0018a.b(88, -2);
                            break;
                        } else {
                            aVar.f1232d.f1306m = -1;
                            c0018a.b(88, -1);
                            break;
                        }
                    } else {
                        c cVar2 = aVar.f1232d;
                        cVar2.f1306m = typedArray.getInteger(index, cVar2.f1307n);
                        c0018a.b(88, aVar.f1232d.f1306m);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1222g.get(index));
                    break;
                case 93:
                    c0018a.b(93, typedArray.getDimensionPixelSize(index, aVar.f1233e.N));
                    break;
                case 94:
                    c0018a.b(94, typedArray.getDimensionPixelSize(index, aVar.f1233e.U));
                    break;
                case 95:
                    k(c0018a, typedArray, index, 0);
                    break;
                case 96:
                    k(c0018a, typedArray, index, 1);
                    break;
                case 97:
                    c0018a.b(97, typedArray.getInt(index, aVar.f1233e.f1283q0));
                    break;
                case 98:
                    if (x.b.O) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f1229a);
                        aVar.f1229a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f1230b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f1230b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f1229a = typedArray.getResourceId(index, aVar.f1229a);
                        break;
                    }
                case 99:
                    c0018a.d(99, typedArray.getBoolean(index, aVar.f1233e.f1266i));
                    break;
            }
        }
    }

    void c(ConstraintLayout constraintLayout, boolean z7) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1228e.keySet());
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            int id = childAt.getId();
            if (!this.f1228e.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + x.a.a(childAt));
            } else {
                if (this.f1227d && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f1228e.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = (a) this.f1228e.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof androidx.constraintlayout.widget.a) {
                                aVar.f1233e.f1269j0 = 1;
                                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                                aVar2.setId(id);
                                aVar2.setType(aVar.f1233e.f1265h0);
                                aVar2.setMargin(aVar.f1233e.f1267i0);
                                aVar2.setAllowsGoneWidget(aVar.f1233e.f1281p0);
                                b bVar = aVar.f1233e;
                                int[] iArr = bVar.f1271k0;
                                if (iArr != null) {
                                    aVar2.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f1273l0;
                                    if (str != null) {
                                        bVar.f1271k0 = f(aVar2, str);
                                        aVar2.setReferencedIds(aVar.f1233e.f1271k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.b(bVar2);
                            if (z7) {
                                androidx.constraintlayout.widget.b.c(childAt, aVar.f1235g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.f1231c;
                            if (dVar.f1310c == 0) {
                                childAt.setVisibility(dVar.f1309b);
                            }
                            childAt.setAlpha(aVar.f1231c.f1311d);
                            childAt.setRotation(aVar.f1234f.f1315b);
                            childAt.setRotationX(aVar.f1234f.f1316c);
                            childAt.setRotationY(aVar.f1234f.f1317d);
                            childAt.setScaleX(aVar.f1234f.f1318e);
                            childAt.setScaleY(aVar.f1234f.f1319f);
                            C0019e c0019e = aVar.f1234f;
                            if (c0019e.f1322i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f1234f.f1322i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c0019e.f1320g)) {
                                    childAt.setPivotX(aVar.f1234f.f1320g);
                                }
                                if (!Float.isNaN(aVar.f1234f.f1321h)) {
                                    childAt.setPivotY(aVar.f1234f.f1321h);
                                }
                            }
                            childAt.setTranslationX(aVar.f1234f.f1323j);
                            childAt.setTranslationY(aVar.f1234f.f1324k);
                            childAt.setTranslationZ(aVar.f1234f.f1325l);
                            C0019e c0019e2 = aVar.f1234f;
                            if (c0019e2.f1326m) {
                                childAt.setElevation(c0019e2.f1327n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = (a) this.f1228e.get(num);
            if (aVar3 != null) {
                if (aVar3.f1233e.f1269j0 == 1) {
                    androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                    aVar4.setId(num.intValue());
                    b bVar3 = aVar3.f1233e;
                    int[] iArr2 = bVar3.f1271k0;
                    if (iArr2 != null) {
                        aVar4.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f1273l0;
                        if (str2 != null) {
                            bVar3.f1271k0 = f(aVar4, str2);
                            aVar4.setReferencedIds(aVar3.f1233e.f1271k0);
                        }
                    }
                    aVar4.setType(aVar3.f1233e.f1265h0);
                    aVar4.setMargin(aVar3.f1233e.f1267i0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    aVar4.m();
                    aVar3.b(generateDefaultLayoutParams);
                    constraintLayout.addView(aVar4, generateDefaultLayoutParams);
                }
                if (aVar3.f1233e.f1250a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.b(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt2 = constraintLayout.getChildAt(i8);
            if (childAt2 instanceof androidx.constraintlayout.widget.c) {
                ((androidx.constraintlayout.widget.c) childAt2).d(constraintLayout);
            }
        }
    }

    public void d(Context context, int i7) {
        e((ConstraintLayout) LayoutInflater.from(context).inflate(i7, (ViewGroup) null));
    }

    public void e(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1228e.clear();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f1227d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1228e.containsKey(Integer.valueOf(id))) {
                this.f1228e.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f1228e.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.f1235g = androidx.constraintlayout.widget.b.a(this.f1226c, childAt);
                aVar.d(id, bVar);
                aVar.f1231c.f1309b = childAt.getVisibility();
                aVar.f1231c.f1311d = childAt.getAlpha();
                aVar.f1234f.f1315b = childAt.getRotation();
                aVar.f1234f.f1316c = childAt.getRotationX();
                aVar.f1234f.f1317d = childAt.getRotationY();
                aVar.f1234f.f1318e = childAt.getScaleX();
                aVar.f1234f.f1319f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    C0019e c0019e = aVar.f1234f;
                    c0019e.f1320g = pivotX;
                    c0019e.f1321h = pivotY;
                }
                aVar.f1234f.f1323j = childAt.getTranslationX();
                aVar.f1234f.f1324k = childAt.getTranslationY();
                aVar.f1234f.f1325l = childAt.getTranslationZ();
                C0019e c0019e2 = aVar.f1234f;
                if (c0019e2.f1326m) {
                    c0019e2.f1327n = childAt.getElevation();
                }
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                    aVar.f1233e.f1281p0 = aVar2.getAllowsGoneWidget();
                    aVar.f1233e.f1271k0 = aVar2.getReferencedIds();
                    aVar.f1233e.f1265h0 = aVar2.getType();
                    aVar.f1233e.f1267i0 = aVar2.getMargin();
                }
            }
        }
    }

    public void h(Context context, int i7) {
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a g8 = g(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        g8.f1233e.f1250a = true;
                    }
                    this.f1228e.put(Integer.valueOf(g8.f1229a), g8);
                }
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        } catch (XmlPullParserException e9) {
            e9.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01aa, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(android.content.Context r8, org.xmlpull.v1.XmlPullParser r9) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.i(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
