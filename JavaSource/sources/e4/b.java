package e4;

import android.util.SparseArray;
import com.google.android.gms.common.data.DataHolder;
import p3.n;
import p3.o;
import q4.v;

/* compiled from: MyApplication */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f23229e = {"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"};

    /* renamed from: a, reason: collision with root package name */
    private String f23230a;

    /* renamed from: b, reason: collision with root package name */
    private String f23231b;

    /* renamed from: c, reason: collision with root package name */
    private int f23232c;

    /* renamed from: d, reason: collision with root package name */
    private SparseArray f23233d = new SparseArray();

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f23234a;

        /* renamed from: b, reason: collision with root package name */
        public final String f23235b;

        /* renamed from: c, reason: collision with root package name */
        public final String f23236c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f23237d;

        public a(long j7, String str, String str2, boolean z7) {
            this.f23234a = j7;
            this.f23235b = str;
            this.f23236c = str2;
            this.f23237d = z7;
        }

        public final String toString() {
            return n.c(this).a("RawScore", Long.valueOf(this.f23234a)).a("FormattedScore", this.f23235b).a("ScoreTag", this.f23236c).a("NewBest", Boolean.valueOf(this.f23237d)).toString();
        }
    }

    public b(DataHolder dataHolder) {
        this.f23232c = dataHolder.Q0();
        int count = dataHolder.getCount();
        o.a(count == 3);
        for (int i7 = 0; i7 < count; i7++) {
            int S0 = dataHolder.S0(i7);
            if (i7 == 0) {
                this.f23230a = dataHolder.R0("leaderboardId", i7, S0);
                this.f23231b = dataHolder.R0("playerId", i7, S0);
            }
            if (dataHolder.M0("hasResult", i7, S0)) {
                this.f23233d.put(dataHolder.N0("timeSpan", i7, S0), new a(dataHolder.O0("rawScore", i7, S0), dataHolder.R0("formattedScore", i7, S0), dataHolder.R0("scoreTag", i7, S0), dataHolder.M0("newBest", i7, S0)));
            }
        }
    }

    public final String toString() {
        n.a a8 = n.c(this).a("PlayerId", this.f23231b).a("StatusCode", Integer.valueOf(this.f23232c));
        for (int i7 = 0; i7 < 3; i7++) {
            a aVar = (a) this.f23233d.get(i7);
            a8.a("TimesSpan", v.a(i7));
            a8.a("Result", aVar == null ? "null" : aVar.toString());
        }
        return a8.toString();
    }
}
