# Trabajar con un Fork en GitHub

## ¿Qué es un fork?

Un **fork** es una **copia de un repositorio ajeno en tu propia cuenta de GitHub**. El repositorio original (el del profesor) sigue intacto; tú trabajas sobre tu copia con total libertad.

| Concepto                 | Qué es               | Dónde vive                  |
| ------------------------ | -------------------- | --------------------------- |
| **Repositorio original** | El repo del profesor | GitHub, cuenta del profesor |
| **Fork**                 | Tu copia del repo    | GitHub, tu cuenta           |
| **Clon**                 | Tu fork descargado   | Tu computador               |

> Fork ≠ clone. El **fork** se hace en GitHub (copia en la nube). El **clone** descarga un repositorio a tu máquina. Primero haces fork, luego clonas **tu fork**.

---

## Qué debes hacer

### 1. Hacer el fork

En la página del repositorio original, clic en **Fork** → selecciona tu cuenta → **Create fork**.

### 2. Clonar TU fork (no el original)

```bash
git clone https://github.com/TU_USUARIO/nombre-repo.git
cd nombre-repo
```

### 3. Trabajar en Main

```bash
git checkout -b feature/mi-cambio
# ... editas, pruebas ...
git add .
git commit -m "Agrega validación de usuario"
```

### 4. Subir a tu fork

```bash
git push origin feature/mi-cambio
```

### 5. Entregar

Entrega el **enlace de tu fork** (`https://github.com/TU_USUARIO/nombre-repo`). Verifica en GitHub que todo tu trabajo esté en `main` antes de enviarlo.

---

## Qué NO debes hacer

- ❌ **Clonar el repositorio original** y trabajar ahí: no tienes permisos para subir, y tu trabajo no queda en tu cuenta.
- ❌ **Trabajar todo directamente en `main`**: usa ramas y une a `main` cuando algo funcione.
- ❌ **Usar `git push --force`** sin saber lo que hace: puedes borrar historial.
- ❌ **Subir credenciales o archivos sensibles** (`.env`, contraseñas, claves de API). Revisa tu `.gitignore`.
- ❌ **Subir carpetas generadas** (`node_modules/`, `target/`, `build/`, `.idea/`).
- ❌ **Borrar y volver a crear el fork** para "arreglar" algo: pierdes historial y el profesor no ve tu progreso.
- ❌ **Commits gigantes con mensajes vacíos** ("cambios", "asdf"): haz commits pequeños y con mensajes claros.
- ❌ **Subir todo el último día**: el historial de commits muestra cómo trabajaste.

---

## Resumen rápido

```
Fork (GitHub) → Clone de tu fork → Rama → Commit → Push → Merge a main → Entregar enlace
```
