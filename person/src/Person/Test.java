package Person;


public class Test {


	public static void main(String[] args){
		Person taro = new Person();
		taro.name ="山田太郎";
		taro.age =20;

		System.out.println(taro.name);
		System.out.println(taro.age);
		taro.talk();
		taro.walk();
		taro.run();


		Person jiro = new Person();
		jiro.name ="鈴木次郎";
		jiro.age =18;


		System.out.println(jiro.name);
		System.out.println(jiro.age);


		Person hanako = new Person();
		hanako.name ="鈴木花子";
		hanako.age =16;


		System.out.println(hanako.name);
		System.out.println(hanako.age);


		Person yoichi = new Person();
		yoichi.name ="田口陽一";
		yoichi.age =29;
		yoichi.phoneNumber="080-0000-0000";
		yoichi.address="神奈川県";


		System.out.println(yoichi.name);
		System.out.println(yoichi.age);
		System.out.println(yoichi.phoneNumber);
		System.out.println(yoichi.address);

	}

}