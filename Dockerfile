FROM node:18-bullseye-slim AS frontend
COPY . /app
WORKDIR /app/frontend
RUN yarn
RUN yarn build

FROM python:3.11-slim-bullseye AS backend
COPY . /app
WORKDIR /app/backend
RUN pip install -r requirements.txt
COPY --from=frontend /app/frontend/build /app/frontend/build
EXPOSE 8000
CMD [ "python", "main.py" ]