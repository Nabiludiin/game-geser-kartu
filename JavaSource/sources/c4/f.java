package c4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: MyApplication */
public abstract class f extends q4.a implements g {
    public f() {
        super("com.google.android.gms.games.internal.IGamesCallbacks");
    }

    @Override // q4.a
    protected final boolean a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 6001) {
            p6(parcel.readString());
        } else if (i7 == 6002) {
            V4(parcel.readString());
        } else if (i7 == 12011) {
            Z6((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
        } else if (i7 == 12012) {
            k6(parcel.readInt(), parcel.readString());
        } else if (i7 == 13001) {
            S3((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
        } else if (i7 == 13002) {
            e0(parcel.readInt());
        } else if (i7 == 19001) {
            l3(parcel.readInt(), (k4.a) q4.t.a(parcel, k4.a.CREATOR));
        } else if (i7 != 19002) {
            switch (i7) {
                case 5001:
                    m0(parcel.readInt(), parcel.readString());
                    break;
                case 5002:
                    j2((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                    break;
                case 5003:
                    i4(parcel.readInt(), parcel.readString());
                    break;
                case 5004:
                    X7((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                    break;
                case 5005:
                    Parcelable.Creator<DataHolder> creator = DataHolder.CREATOR;
                    s7((DataHolder) q4.t.a(parcel, creator), (DataHolder) q4.t.a(parcel, creator));
                    break;
                case 5006:
                    v5((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                    break;
                case 5007:
                    r6((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                    break;
                case 5008:
                    E3((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                    break;
                case 5009:
                    b4((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                    break;
                case 5010:
                    Q1((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                    break;
                case 5011:
                    G2((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                    break;
                default:
                    switch (i7) {
                        case 5016:
                            a1();
                            break;
                        case 5017:
                            H6((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5018:
                            a7((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5019:
                            Z7((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5020:
                            s3(parcel.readInt(), parcel.readString());
                            break;
                        case 5021:
                            w5((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5022:
                            u6((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5023:
                            F3((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5024:
                            d4((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5025:
                            S1((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5026:
                            o3((DataHolder) q4.t.a(parcel, DataHolder.CREATOR), parcel.createStringArray());
                            break;
                        case 5027:
                            s2((DataHolder) q4.t.a(parcel, DataHolder.CREATOR), parcel.createStringArray());
                            break;
                        case 5028:
                            R1((DataHolder) q4.t.a(parcel, DataHolder.CREATOR), parcel.createStringArray());
                            break;
                        case 5029:
                            R7((DataHolder) q4.t.a(parcel, DataHolder.CREATOR), parcel.createStringArray());
                            break;
                        case 5030:
                            M6((DataHolder) q4.t.a(parcel, DataHolder.CREATOR), parcel.createStringArray());
                            break;
                        case 5031:
                            U5((DataHolder) q4.t.a(parcel, DataHolder.CREATOR), parcel.createStringArray());
                            break;
                        case 5032:
                            f1((g4.a) q4.t.a(parcel, g4.a.CREATOR));
                            break;
                        case 5033:
                            j7(parcel.readInt(), parcel.readInt(), parcel.readString());
                            break;
                        case 5034:
                            k1(parcel.readInt(), parcel.readString(), q4.t.d(parcel));
                            break;
                        case 5035:
                            F7((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5036:
                            R(parcel.readInt());
                            break;
                        case 5037:
                            H7((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5038:
                            I2((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5039:
                            J7((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5040:
                            V(parcel.readInt());
                            break;
                        case 9001:
                            w2((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 11001:
                            t2(parcel.readInt(), (Bundle) q4.t.a(parcel, Bundle.CREATOR));
                            break;
                        case 12001:
                            K3((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 14001:
                            x3((DataHolder[]) parcel.createTypedArray(DataHolder.CREATOR));
                            break;
                        case 15001:
                            m3((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 17002:
                            B(parcel.readInt());
                            break;
                        case 19008:
                            b0(parcel.readInt());
                            break;
                        case 19009:
                            F(parcel.readInt());
                            break;
                        case 19010:
                            I(parcel.readInt());
                            break;
                        case 20001:
                            y2((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 20002:
                            u1((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 20003:
                            z1((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 20004:
                            M7((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 20005:
                            O6((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 20006:
                            g6((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 20007:
                            m5((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 20008:
                            p4((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 20009:
                            L3((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                            break;
                        case 20012:
                            E7((Status) q4.t.a(parcel, Status.CREATOR));
                            break;
                        case 20019:
                            k3(parcel.readInt());
                            break;
                        case 20020:
                            N1(parcel.readInt(), (Bundle) q4.t.a(parcel, Bundle.CREATOR));
                            break;
                        case 23001:
                            m4(parcel.readInt());
                            break;
                        case 23002:
                            S0(parcel.readInt());
                            break;
                        case 23003:
                            P(parcel.readInt());
                            break;
                        default:
                            switch (i7) {
                                case 8001:
                                    L6((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                                    break;
                                case 8002:
                                    Y3(parcel.readInt(), (Bundle) q4.t.a(parcel, Bundle.CREATOR));
                                    break;
                                case 8003:
                                    B5((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                                    break;
                                case 8004:
                                    Y2((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                                    break;
                                case 8005:
                                    Q3((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                                    break;
                                case 8006:
                                    h1((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                                    break;
                                case 8007:
                                    G0(parcel.readInt(), parcel.readString());
                                    break;
                                case 8008:
                                    P2((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                                    break;
                                case 8009:
                                    P1(parcel.readString());
                                    break;
                                case 8010:
                                    e6(parcel.readString());
                                    break;
                                default:
                                    switch (i7) {
                                        case 10001:
                                            T4((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                                            break;
                                        case 10002:
                                            v(parcel.readString());
                                            break;
                                        case 10003:
                                            d6((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                                            break;
                                        case 10004:
                                            j5((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                                            break;
                                        case 10005:
                                            D0(parcel.readInt(), (Bundle) q4.t.a(parcel, Bundle.CREATOR));
                                            break;
                                        case 10006:
                                            n4((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                                            break;
                                        default:
                                            switch (i7) {
                                                case 12004:
                                                    u7((DataHolder) q4.t.a(parcel, DataHolder.CREATOR), (v3.a) q4.t.a(parcel, v3.a.CREATOR));
                                                    break;
                                                case 12005:
                                                    T2((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                                                    break;
                                                case 12006:
                                                    b2((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                                                    break;
                                                case 12007:
                                                    h7((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                                                    break;
                                                case 12008:
                                                    J4((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                                                    break;
                                                default:
                                                    switch (i7) {
                                                        case 12014:
                                                            C6((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                                                            break;
                                                        case 12015:
                                                            M2(parcel.readInt(), (Bundle) q4.t.a(parcel, Bundle.CREATOR));
                                                            break;
                                                        case 12016:
                                                            E5((DataHolder) q4.t.a(parcel, DataHolder.CREATOR));
                                                            break;
                                                        case 12017:
                                                            DataHolder dataHolder = (DataHolder) q4.t.a(parcel, DataHolder.CREATOR);
                                                            String readString = parcel.readString();
                                                            Parcelable.Creator<v3.a> creator2 = v3.a.CREATOR;
                                                            o2(dataHolder, readString, (v3.a) q4.t.a(parcel, creator2), (v3.a) q4.t.a(parcel, creator2), (v3.a) q4.t.a(parcel, creator2));
                                                            break;
                                                        default:
                                                            return false;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            j1(parcel.readInt(), q4.t.d(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
