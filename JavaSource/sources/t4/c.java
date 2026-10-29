package t4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.r0;
import com.google.android.gms.measurement.internal.ae;
import com.google.android.gms.measurement.internal.ud;
import java.util.List;

/* compiled from: MyApplication */
public abstract class c extends q0 implements d {
    public c() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.q0
    protected final boolean a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        j jVar = null;
        g gVar = null;
        switch (i7) {
            case 1:
                com.google.android.gms.measurement.internal.g0 g0Var = (com.google.android.gms.measurement.internal.g0) r0.b(parcel, com.google.android.gms.measurement.internal.g0.CREATOR);
                ae aeVar = (ae) r0.b(parcel, ae.CREATOR);
                r0.f(parcel);
                q4(g0Var, aeVar);
                parcel2.writeNoException();
                return true;
            case 2:
                ud udVar = (ud) r0.b(parcel, ud.CREATOR);
                ae aeVar2 = (ae) r0.b(parcel, ae.CREATOR);
                r0.f(parcel);
                i5(udVar, aeVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                ae aeVar3 = (ae) r0.b(parcel, ae.CREATOR);
                r0.f(parcel);
                l6(aeVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.measurement.internal.g0 g0Var2 = (com.google.android.gms.measurement.internal.g0) r0.b(parcel, com.google.android.gms.measurement.internal.g0.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                r0.f(parcel);
                c2(g0Var2, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                ae aeVar4 = (ae) r0.b(parcel, ae.CREATOR);
                r0.f(parcel);
                s4(aeVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                ae aeVar5 = (ae) r0.b(parcel, ae.CREATOR);
                boolean a8 = r0.a(parcel);
                r0.f(parcel);
                List Y7 = Y7(aeVar5, a8);
                parcel2.writeNoException();
                parcel2.writeTypedList(Y7);
                return true;
            case 9:
                com.google.android.gms.measurement.internal.g0 g0Var3 = (com.google.android.gms.measurement.internal.g0) r0.b(parcel, com.google.android.gms.measurement.internal.g0.CREATOR);
                String readString3 = parcel.readString();
                r0.f(parcel);
                byte[] I4 = I4(g0Var3, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(I4);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                r0.f(parcel);
                B2(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                ae aeVar6 = (ae) r0.b(parcel, ae.CREATOR);
                r0.f(parcel);
                String o7 = o7(aeVar6);
                parcel2.writeNoException();
                parcel2.writeString(o7);
                return true;
            case 12:
                com.google.android.gms.measurement.internal.i iVar = (com.google.android.gms.measurement.internal.i) r0.b(parcel, com.google.android.gms.measurement.internal.i.CREATOR);
                ae aeVar7 = (ae) r0.b(parcel, ae.CREATOR);
                r0.f(parcel);
                r1(iVar, aeVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.measurement.internal.i iVar2 = (com.google.android.gms.measurement.internal.i) r0.b(parcel, com.google.android.gms.measurement.internal.i.CREATOR);
                r0.f(parcel);
                N4(iVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean a9 = r0.a(parcel);
                ae aeVar8 = (ae) r0.b(parcel, ae.CREATOR);
                r0.f(parcel);
                List V6 = V6(readString7, readString8, a9, aeVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(V6);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean a10 = r0.a(parcel);
                r0.f(parcel);
                List m12 = m1(readString9, readString10, readString11, a10);
                parcel2.writeNoException();
                parcel2.writeTypedList(m12);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                ae aeVar9 = (ae) r0.b(parcel, ae.CREATOR);
                r0.f(parcel);
                List q7 = q7(readString12, readString13, aeVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(q7);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                r0.f(parcel);
                List h32 = h3(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(h32);
                return true;
            case 18:
                ae aeVar10 = (ae) r0.b(parcel, ae.CREATOR);
                r0.f(parcel);
                C2(aeVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) r0.b(parcel, Bundle.CREATOR);
                ae aeVar11 = (ae) r0.b(parcel, ae.CREATOR);
                r0.f(parcel);
                u5(bundle, aeVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                ae aeVar12 = (ae) r0.b(parcel, ae.CREATOR);
                r0.f(parcel);
                V7(aeVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                ae aeVar13 = (ae) r0.b(parcel, ae.CREATOR);
                r0.f(parcel);
                a n52 = n5(aeVar13);
                parcel2.writeNoException();
                if (n52 == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    n52.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                ae aeVar14 = (ae) r0.b(parcel, ae.CREATOR);
                Bundle bundle2 = (Bundle) r0.b(parcel, Bundle.CREATOR);
                r0.f(parcel);
                List e42 = e4(aeVar14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(e42);
                return true;
            case 25:
                ae aeVar15 = (ae) r0.b(parcel, ae.CREATOR);
                r0.f(parcel);
                M3(aeVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                ae aeVar16 = (ae) r0.b(parcel, ae.CREATOR);
                r0.f(parcel);
                x4(aeVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                ae aeVar17 = (ae) r0.b(parcel, ae.CREATOR);
                r0.f(parcel);
                J6(aeVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                ae aeVar18 = (ae) r0.b(parcel, ae.CREATOR);
                n0 n0Var = (n0) r0.b(parcel, n0.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    jVar = queryLocalInterface instanceof j ? (j) queryLocalInterface : new h(readStrongBinder);
                }
                r0.f(parcel);
                y7(aeVar18, n0Var, jVar);
                parcel2.writeNoException();
                return true;
            case 30:
                ae aeVar19 = (ae) r0.b(parcel, ae.CREATOR);
                com.google.android.gms.measurement.internal.g gVar2 = (com.google.android.gms.measurement.internal.g) r0.b(parcel, com.google.android.gms.measurement.internal.g.CREATOR);
                r0.f(parcel);
                G4(aeVar19, gVar2);
                parcel2.writeNoException();
                return true;
            case 31:
                ae aeVar20 = (ae) r0.b(parcel, ae.CREATOR);
                Bundle bundle3 = (Bundle) r0.b(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    gVar = queryLocalInterface2 instanceof g ? (g) queryLocalInterface2 : new e(readStrongBinder2);
                }
                r0.f(parcel);
                w1(aeVar20, bundle3, gVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
