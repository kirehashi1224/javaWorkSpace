public class Dancer extends Character{
	public void dance(){
		System.out.println(this.name + "��M�I�ɗx����");
	}
	public void attack(Matango m){
		System.out.println(this.name + "�̍U��");
		System.out.println("�G�ɂR�|�C���g�̃_���[�W");
		m.hp -= 3;
	}
}