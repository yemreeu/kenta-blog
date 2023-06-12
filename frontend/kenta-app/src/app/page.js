import Image from "next/image";
import styles from "./page.module.css";
import Main from "public/main.png";
import Button from "@/components/Button/Button";

export default function Home() {
  return (
    <div className={styles.container}>
      <div className={styles.item}>
        <h1 className={styles.title}>Kenta'ya Hoşgeldiniz !</h1>
        <p className={styles.description}>
          Kenta Kenta Kenta Kenta Kenta Kenta Kenta Kenta Kenta Kenta Kenta Kenta Kenta.
        </p>
        <Button url="/portfolio" text="Projelerimizi / Çalışmalarımızı Görün"/>
      </div>
      <div className={styles.item}>
        <Image src={Main} alt="kenta" className={styles.img} />
      </div>
    </div>
  );
}
