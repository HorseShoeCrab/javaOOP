package encapsule;


/*
 ī���������� �����ִ� ���(������Ʈ)
 */
public class KaupVO {
	// �޼ҵ� = ����������(public) + ����(void) + �޼ҵ��̸� + () + {}
	public String getKaup(double height, double weight){
	
		int idx= (int) ((weight/(height*height))*10000); // double Ÿ���� ������� int Ÿ���� ������ �Ҵ� -> ĳ���� �߻�
		String msg = "";
		if (idx>30){
			msg = "��";
		}else if(idx>24){
			msg = "��ü��";
		}else if(idx>20){
			msg = "����";
		}else if(idx>15){
			msg = "��ü��";
		}else if(idx>13){
			msg = "����";
		}else if(idx>10){
			msg = "�������";
		}
		return msg;
	}
}