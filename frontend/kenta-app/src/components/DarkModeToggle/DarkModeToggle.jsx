"use client"
import React from "react";
import styles from "./darkModeToggle.module.css";
import { ThemeContext } from "../../../context/ThemeContext";
import { useContext } from "react";

export const DarkModeToggle = () => {

  const {toggle,mode} = useContext(ThemeContext);
  return (
    <div className={styles.container} onClick={toggle}>
      <div className={styles.icon}>🌙</div>
      <div className={styles.icon}>🔆</div>
      <div
        className={styles.ball}
        style={mode === "light" ? { left: "2px" } : { right: "2px" }}
      />
    </div>
  );
};
