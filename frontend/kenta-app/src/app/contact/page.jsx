import React from "react";
import styles from "./page.module.css";
import Image from "next/image";
import Button from "@/components/Button/Button";

const Contact = () => {
  return (
    <div className={styles.container}>
      <h1 className={styles.title}>İletişimde Kalalım!</h1>
      <div className={styles.content}>
        <div className={styles.imgContainer}>
          <Image src="/contact.png" fill={true} alt="" className={styles.img} />
        </div>
        <form className={styles.form}>
          <input type="text" className={styles.input} placeholder="name" />
          <input type="text" className={styles.input} placeholder="email" />
          <textarea className={styles.textArea} placeholder="Mesajınız" cols="30" rows="10"></textarea>
          <Button url="#" text="Gönder" />
        </form>
      </div>
    </div>
  );
};

export default Contact;
