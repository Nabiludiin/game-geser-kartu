package s2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.a70;
import com.google.android.gms.internal.ads.b70;
import com.google.android.gms.internal.ads.cf0;
import com.google.android.gms.internal.ads.e70;
import com.google.android.gms.internal.ads.jb0;
import com.google.android.gms.internal.ads.kb0;
import com.google.android.gms.internal.ads.ki0;
import com.google.android.gms.internal.ads.p20;
import com.google.android.gms.internal.ads.th0;
import com.google.android.gms.internal.ads.u20;
import com.google.android.gms.internal.ads.ve0;
import com.google.android.gms.internal.ads.wk0;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zq;
import w3.a;

/* compiled from: MyApplication */
public abstract class n1 extends yq implements o1 {
    public n1() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                g5 g5Var = (g5) zq.b(parcel, g5.CREATOR);
                String readString = parcel.readString();
                kb0 j8 = jb0.j8(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zq.h(parcel);
                v0 j62 = j6(O, g5Var, readString, j8, readInt);
                parcel2.writeNoException();
                zq.e(parcel2, j62);
                return true;
            case 2:
                w3.a O2 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                g5 g5Var2 = (g5) zq.b(parcel, g5.CREATOR);
                String readString2 = parcel.readString();
                kb0 j82 = jb0.j8(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zq.h(parcel);
                v0 X6 = X6(O2, g5Var2, readString2, j82, readInt2);
                parcel2.writeNoException();
                zq.e(parcel2, X6);
                return true;
            case 3:
                w3.a O3 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                kb0 j83 = jb0.j8(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zq.h(parcel);
                r0 x12 = x1(O3, readString3, j83, readInt3);
                parcel2.writeNoException();
                zq.e(parcel2, x12);
                return true;
            case 4:
                a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                parcel2.writeNoException();
                zq.e(parcel2, null);
                return true;
            case 5:
                w3.a O4 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                w3.a O5 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                p20 W4 = W4(O4, O5);
                parcel2.writeNoException();
                zq.e(parcel2, W4);
                return true;
            case 6:
                w3.a O6 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                kb0 j84 = jb0.j8(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zq.h(parcel);
                th0 a52 = a5(O6, j84, readInt4);
                parcel2.writeNoException();
                zq.e(parcel2, a52);
                return true;
            case 7:
                a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                parcel2.writeNoException();
                zq.e(parcel2, null);
                return true;
            case 8:
                w3.a O7 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                cf0 q02 = q0(O7);
                parcel2.writeNoException();
                zq.e(parcel2, q02);
                return true;
            case 9:
                w3.a O8 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zq.h(parcel);
                z1 p22 = p2(O8, readInt5);
                parcel2.writeNoException();
                zq.e(parcel2, p22);
                return true;
            case 10:
                w3.a O9 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                g5 g5Var3 = (g5) zq.b(parcel, g5.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zq.h(parcel);
                v0 K7 = K7(O9, g5Var3, readString4, readInt6);
                parcel2.writeNoException();
                zq.e(parcel2, K7);
                return true;
            case 11:
                w3.a O10 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                w3.a O11 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                w3.a O12 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                u20 d72 = d7(O10, O11, O12);
                parcel2.writeNoException();
                zq.e(parcel2, d72);
                return true;
            case 12:
                w3.a O13 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                kb0 j85 = jb0.j8(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zq.h(parcel);
                ki0 e22 = e2(O13, readString5, j85, readInt7);
                parcel2.writeNoException();
                zq.e(parcel2, e22);
                return true;
            case 13:
                w3.a O14 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                g5 g5Var4 = (g5) zq.b(parcel, g5.CREATOR);
                String readString6 = parcel.readString();
                kb0 j86 = jb0.j8(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zq.h(parcel);
                v0 B7 = B7(O14, g5Var4, readString6, j86, readInt8);
                parcel2.writeNoException();
                zq.e(parcel2, B7);
                return true;
            case 14:
                w3.a O15 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                kb0 j87 = jb0.j8(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zq.h(parcel);
                wk0 y62 = y6(O15, j87, readInt9);
                parcel2.writeNoException();
                zq.e(parcel2, y62);
                return true;
            case 15:
                w3.a O16 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                kb0 j88 = jb0.j8(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zq.h(parcel);
                ve0 o52 = o5(O16, j88, readInt10);
                parcel2.writeNoException();
                zq.e(parcel2, o52);
                return true;
            case 16:
                w3.a O17 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                kb0 j89 = jb0.j8(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                b70 j810 = a70.j8(parcel.readStrongBinder());
                zq.h(parcel);
                e70 l7 = l7(O17, j89, readInt11, j810);
                parcel2.writeNoException();
                zq.e(parcel2, l7);
                return true;
            case 17:
                w3.a O18 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                kb0 j811 = jb0.j8(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zq.h(parcel);
                t2 c32 = c3(O18, j811, readInt12);
                parcel2.writeNoException();
                zq.e(parcel2, c32);
                return true;
            case 18:
                w3.a O19 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                kb0 j812 = jb0.j8(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                zq.h(parcel);
                h1 n32 = n3(O19, j812, readInt13);
                parcel2.writeNoException();
                zq.e(parcel2, n32);
                return true;
            default:
                return false;
        }
    }
}
